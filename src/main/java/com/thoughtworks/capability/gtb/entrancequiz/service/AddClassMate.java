package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.domain.ClassMate;

import java.util.List;

public class AddClassMate {
    public static List<ClassMate> addClassMate(String name) {
        List<ClassMate> classMate = GetClassMate.getStudents();
        String id=classMate.size()+"";
        classMate.add(new ClassMate(id,name));
        return classMate;
    }
}
