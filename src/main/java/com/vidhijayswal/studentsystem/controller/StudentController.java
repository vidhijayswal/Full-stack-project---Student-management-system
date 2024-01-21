package com.vidhijayswal.studentsystem.controller;

import com.vidhijayswal.studentsystem.model.Student;
import com.vidhijayswal.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController
{
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student)
    {
        studentService.saveStudent(student);
        return "New student is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents()
    {
        return studentService.getAllStudents();
    }
}
