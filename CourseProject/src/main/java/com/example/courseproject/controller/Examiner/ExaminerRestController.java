package com.example.courseproject.controller.Examiner;


import com.example.courseproject.model.Examiner;
import com.example.courseproject.service.Student.impls.ExaminerServiceImpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/examiner")
public class ExaminerRestController {
    @Autowired
    ExaminerServiceImpls service;

    @GetMapping("/{studentId}")
    Examiner showOne(@PathVariable String studentId) {
        return service.get(studentId);
    }

    @PutMapping("")
    Examiner updateOne(@RequestBody Examiner examiner) {
        return service.estimate(examiner);
    }
}