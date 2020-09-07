package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.ClassMate;
import com.thoughtworks.capability.gtb.entrancequiz.domain.Team;

import java.util.*;

public class Group {
    public static Map<Integer, List<ClassMate>> group() {
        List<ClassMate> classMate = GetClassMate.getStudents();
        Collections.shuffle(classMate);
        Map<Integer, List<ClassMate>> team = new HashMap<>();
        for(int i=1;i<=6;i++) team.put(i, new ArrayList<>());
        for (int j = 0; j < classMate.size(); j++) {
            int index = (j % 6) + 1;
            team.get(index).add(classMate.get(j));
        }
        return team;
    }
}
