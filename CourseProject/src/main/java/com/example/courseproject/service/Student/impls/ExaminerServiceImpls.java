package com.example.courseproject.service.Student.impls;


import com.example.courseproject.model.Examiner;
import com.example.courseproject.model.Student;
import com.example.courseproject.repository.IExaminerMongoRepository;
import com.example.courseproject.service.Student.interfaces.IExaminerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ExaminerServiceImpls implements IExaminerService {

    @Autowired
    IExaminerMongoRepository repository;

    @Override
    public Examiner get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Examiner create(Examiner examiner) {
        return repository.save(examiner);
    }

    @Override
    public Examiner estimate(Examiner examiner) {

        return repository.save(examiner);
    }

}