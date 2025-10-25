package com.student.analyzer.studentanalyser.service;

import com.student.analyzer.studentanalyser.model.Student;
import com.student.analyzer.studentanalyser.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public List<Student> getAllStudent(){
        return studentRepository.findAll();

    }

}
