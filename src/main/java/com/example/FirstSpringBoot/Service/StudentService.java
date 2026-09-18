package com.example.FirstSpringBoot.Service;

import com.example.FirstSpringBoot.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> list = new ArrayList<>(
            Arrays.asList(
                    new Student(1, "Raj", "Java"),
                    new Student(2, "July", "SpringBoot")
            )
    );

    public List<Student> getAllStudent() {
        return list;
    }
}