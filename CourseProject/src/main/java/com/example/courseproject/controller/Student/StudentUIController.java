package com.example.courseproject.controller.Student;

import com.example.courseproject.form.StudentForm;
import com.example.courseproject.model.Examiner;
import com.example.courseproject.model.Student;
import com.example.courseproject.service.Student.impls.ExaminerServiceImpls;
import com.example.courseproject.service.Student.impls.StudentServiceImpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentUIController {
    @Autowired
    StudentServiceImpls service;

    @GetMapping("/")
    String showAll(Model model) {
        List<Student> list = service.getAll();
        model.addAttribute("students", list);
        return "students-all";
    }

    @GetMapping("/delete/{id}")
    String delete(@PathVariable String id) {
        service.delete(id);
        return "redirect:/students/";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String createStudent(Model model){
        StudentForm studentForm = new StudentForm();

        model.addAttribute("form", studentForm);
        return "create-student";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String createStudent( @ModelAttribute("form") StudentForm form ){

        Student student = new Student();
        student.setFirstName(form.getFirstName());
        student.setLastName(form.getLastName());
        student.setSpecialty(form.getSpecialty());
        student.setExaminer("");
        student.setPoints1("");
        student.setPoints2("");
        student.setPoints3("");

        service.create(student);
        return "redirect:/students/";
    }


    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateStudent(Model model, @PathVariable("id") String id){
        Student student = service.get(id);
        StudentForm studentform = new StudentForm();
        studentform.setId(student.getId());
        studentform.setFirstName(student.getFirstName());
        studentform.setLastName(student.getLastName());
        studentform.setSpecialty(student.getSpecialty().toString());

        model.addAttribute("form",studentform);

        return "update-student";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateStudent(@PathVariable("id") String id,
                           @ModelAttribute("form") StudentForm form ){
        Student student = service.get(form.getId());
        student.setFirstName(form.getFirstName());
        student.setLastName(form.getLastName());
        student.setSpecialty(form.getSpecialty());

        service.update(student);
        return "redirect:/students/";
    }

    @GetMapping("/view")
    String view(Model model) {
        List<Student> list = service.getAll();
        model.addAttribute("students", list);
        return "view";
    }

}
