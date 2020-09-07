package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.domain.ClassMate;
import com.thoughtworks.capability.gtb.entrancequiz.service.GetClassMate;
import com.thoughtworks.capability.gtb.entrancequiz.service.Group;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class classMateController {
    @GetMapping("/classMate/list")
    public List<ClassMate> getClassMateList() {
        return GetClassMate.getStudents();
    }
    @GetMapping("/classMate/group")
    public Map<Integer, List<ClassMate>> getClassMateGroup() {
        return Group.group();
    }
}
