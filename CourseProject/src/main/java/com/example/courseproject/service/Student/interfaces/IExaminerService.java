package com.example.courseproject.service.Student.interfaces;


import com.example.courseproject.model.Examiner;
import com.example.courseproject.model.Student;

public interface IExaminerService {
    Examiner get(String id);
    Examiner create(Examiner examiner);
    Examiner estimate(Examiner examiner);
}