package com.example.courseproject.controller.Examiner;

import com.example.courseproject.form.ExaminerForm;
import com.example.courseproject.form.StudentForm;
import com.example.courseproject.model.Student;
import com.example.courseproject.service.Student.impls.StudentServiceImpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/students")
public class ExaminerUIController {
    @Autowired
    StudentServiceImpls service;

    @GetMapping("/examinerView")
    String examinerView(Model model) {
        List<Student> list = service.getAll();
        model.addAttribute("students", list);
        return "examinerView";
    }

    @RequestMapping (value = "/points/{id}", method = RequestMethod.GET)
    public String show(Model model, @PathVariable("id") String id) {
        Student student = service.get(id);
        model.addAttribute("student", student);
        return "points";
    }

    @RequestMapping (value = "/view-points/{id}", method = RequestMethod.GET)
    public String viewPoints(Model model, @PathVariable("id") String id) {
        Student student = service.get(id);
        model.addAttribute("student", student);
        return "view-points";
    }

    @RequestMapping(value = "/estimate/{id}", method = RequestMethod.GET)
    public String estimate(Model model, @PathVariable("id") String id){
        Student student = service.get(id);
        ExaminerForm examinerForm = new ExaminerForm();
        examinerForm.setExaminer(student.getExaminer());
        examinerForm.setPoints1(student.getPoints1());
        examinerForm.setPoints2(student.getPoints2());
        examinerForm.setPoints3(student.getPoints3());

        model.addAttribute("form",examinerForm);
        model.addAttribute("student", student);

        return "estimate";
    }

    @RequestMapping(value = "/estimate/{id}", method = RequestMethod.POST)
    public String estimate(@PathVariable("id") String id,
                                @ModelAttribute("form") ExaminerForm form ){
        Student student = service.get(form.getId());
        student.setExaminer(form.getExaminer());
        student.setPoints1(form.getPoints1());
        student.setPoints2(form.getPoints2());
        student.setPoints3(form.getPoints3());

        service.update(student);
        return "redirect:/students/points/{id}";
    }

}