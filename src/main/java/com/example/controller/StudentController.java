package com.example.controller;

import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.entity.Student;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService ss;

    @PostMapping("/insert")
    public String insertStudent(@RequestBody Student stud) {
        ss.insertStudent(stud);
        return "data inserted successfully";
    }

    @DeleteMapping("/deletedata/{stud_id}")
    public String deleteStudent(@PathVariable int stud_id) {
        ss.deleteStudent(stud_id);
        return "data deleted successfully";
    }

    @PutMapping("/updatedata/{stud_id}")
    public void updateStudent(@PathVariable int stud_id, @RequestBody Student s){
        ss.updateStudent(stud_id,s);
    }

    @GetMapping("/getallstudents")
    public List<Student> getAllStudent(){
        return ss.getAllStudent();
    }
}
