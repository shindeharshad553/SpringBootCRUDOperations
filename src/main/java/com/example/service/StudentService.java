package com.example.service;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.StudentDAO;
import com.example.entity.Student;
import org.hibernate.SessionFactory;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentDAO sd;
    @Autowired
    SessionFactory sf;

    public void insertStudent(Student stud) {
        Session s = sf.openSession();
        Transaction tr = s.beginTransaction();
        s.persist(stud);
        tr.commit();
        s.close();
    }

    public void deleteStudent(int stud_id) {
        Session s = sf.openSession();
        Transaction tr = s.beginTransaction();

//        get the object of stud_id
        Student stud = s.get(Student.class, stud_id);
        s.remove(stud);
        tr.commit();
        s.close();
    }

    public void updateStudent(int stud_id, Student s) {
        Session session = sf.openSession();
        Transaction tr = session.beginTransaction();
        Student obj = session.get(Student.class, stud_id);
        obj.setName(s.getName());
        obj.setAge(s.getAge());
        obj.setAddress(s.getAddress());

        session.merge(obj);
        tr.commit();
        session.close();
    }
    public List<Student> getAllStudent(){
        return sd.findAll();
    }

}
