package com.example.databasedemo.service;
import com.example.databasedemo.entity.Student;
import com.example.databasedemo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired(required = false)
    public StudentMapper studentMapper;
    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }

    public List<Student> findStudentByno(int no) {
        return studentMapper.findStudentByno(no);
    }
}

