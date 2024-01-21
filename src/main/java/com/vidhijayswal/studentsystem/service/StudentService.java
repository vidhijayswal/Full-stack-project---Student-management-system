package com.vidhijayswal.studentsystem.service;

import com.vidhijayswal.studentsystem.model.Student;
import java.util.List;
public interface StudentService
{
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
