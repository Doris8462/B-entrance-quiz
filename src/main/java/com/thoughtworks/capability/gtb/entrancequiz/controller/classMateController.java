package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.ClassMate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class classMateController {

    private static List<ClassMate> getStudents() {
        List<ClassMate> classMate = new ArrayList<>();
        classMate.add(new ClassMate("1", "沈乐棋"));
        classMate.add(new ClassMate("2", "徐慧慧"));
        classMate.add(new ClassMate("3", "陈思聪"));
        classMate.add(new ClassMate("4", "王江林"));
        classMate.add(new ClassMate("5", "王登宇"));
        classMate.add(new ClassMate("6", "杨思雨"));
        classMate.add(new ClassMate("7", "江雨舟"));
        classMate.add(new ClassMate("8", "廖燊"));
        classMate.add(new ClassMate("9", "胡晓"));
        classMate.add(new ClassMate("10", "但杰"));
        classMate.add(new ClassMate("11", "盖迈达"));
        classMate.add(new ClassMate("12", "肖美琦"));
        classMate.add(new ClassMate("13", "黄云洁"));
        classMate.add(new ClassMate("14", "齐瑾浩"));
        classMate.add(new ClassMate("15", "刘亮亮"));
        classMate.add(new ClassMate("16", "肖逸凡"));
        classMate.add(new ClassMate("17", "王作文"));
        classMate.add(new ClassMate("18", "郭瑞凌"));
        classMate.add(new ClassMate("19", "李明豪"));
        classMate.add(new ClassMate("20", "党泽"));
        classMate.add(new ClassMate("21", "肖伊佐"));
        classMate.add(new ClassMate("22", "贠晨曦"));
        classMate.add(new ClassMate("23", "李康宁"));
        classMate.add(new ClassMate("24", "马庆"));
        classMate.add(new ClassMate("25", "商婕"));
        classMate.add(new ClassMate("26", "余榕"));
        classMate.add(new ClassMate("27", "谌哲"));
        classMate.add(new ClassMate("28", "董翔锐"));
        classMate.add(new ClassMate("29", "陈泰宇"));
        classMate.add(new ClassMate("30", "赵允齐"));
        classMate.add(new ClassMate("31", "张柯"));
        classMate.add(new ClassMate("32", "廖文强"));
        classMate.add(new ClassMate("33", "刘轲"));
        classMate.add(new ClassMate("34", "廖浚斌"));
        classMate.add(new ClassMate("35", "凌凤仪"));
        return classMate;
    }
    @GetMapping("/classMate/list")
    public List<ClassMate> getClassMateList() {
        return getStudents();
    }
}
