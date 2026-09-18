package com.example.FirstSpringBoot.Controller;

import com.example.FirstSpringBoot.Model.Student;
import com.example.FirstSpringBoot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return service.getAllStudent();
    }
}