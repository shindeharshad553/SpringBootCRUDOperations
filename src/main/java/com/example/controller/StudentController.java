package com.example.controller;

import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.Student;

@RestController
public class StudentController {

    @Autowired
    StudentService ss;

    @PostMapping("/insert")
    public String insertStudent(@RequestBody Student stud) {
        ss.insertStudent(stud);
        return "data inserted successfully";
    }
}
