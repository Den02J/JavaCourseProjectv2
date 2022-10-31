package com.example.courseproject.service.Student.interfaces;

import com.example.courseproject.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IStudentService {
    List<Student> getAll();
    Student create(Student student);
    Student update(Student student);
    Student get(String id);
    void delete(String id);

}
