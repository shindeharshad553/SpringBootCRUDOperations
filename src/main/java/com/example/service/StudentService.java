package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.StudentDAO;
import com.example.entity.Student;

@Service
public class StudentService {
    @Autowired
    StudentDAO sd;

    public void insertStudent(Student stud) {
        sd.insertStudent(stud);
    }
}
