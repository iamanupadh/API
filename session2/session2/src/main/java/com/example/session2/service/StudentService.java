package com.example.session2.service;

import com.example.session2.da.StudentDa;
import com.example.session2.entity.StudentEntity;
import com.example.session2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentDa studentDa;

    public Student createStudent(Student student){
        var studentEntity = new StudentEntity();
        studentEntity.setEmail(student.getEmail());
        studentEntity.setName(student.getName());
        var result =  studentDa.save(studentEntity);
        student.setEmail(result.getEmail());
        student.setName(result.getName());
        return student;
    }
}
