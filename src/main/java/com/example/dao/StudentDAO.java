package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Repository
public class StudentDAO {
    @Autowired
    SessionFactory sf;
    public void insertStudent(Student stud) {
        Session s = sf.openSession();
        Transaction tr = s.beginTransaction();
        s.persist(stud);
        tr.commit();
        s.close();
    }
}
