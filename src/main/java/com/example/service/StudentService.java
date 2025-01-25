package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.StudentDAO;
import com.example.entity.Student;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDAO sd;

    public void insertStudent(Student stud) {
        sd.insertStudent(stud);
    }

    public void deleteStudent(int stud_id){
        sd.deleteStudent(stud_id);
    }

    public void updateStudent(int stud_id,Student s){
        sd.updateStudent(stud_id,s);
    }
}
