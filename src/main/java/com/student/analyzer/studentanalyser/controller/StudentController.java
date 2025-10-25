package com.student.analyzer.studentanalyser.controller;

import com.student.analyzer.studentanalyser.model.Student;
import com.student.analyzer.studentanalyser.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student/api")
public class StudentController {
    private final StudentService studentService;
    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping("/getStudentsByCity")
    public Object getByDepartment(){
        List<Student> studentList = studentService.getAllStudent();
         studentList.stream().collect(Collectors.groupingBy(student -> student.address().cityId()));
        return null;
    }
}
