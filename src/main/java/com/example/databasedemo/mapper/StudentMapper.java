package com.example.databasedemo.mapper;

import com.example.databasedemo.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> findAllStudent();

    List<Student> findStudentByno(int no);
}
