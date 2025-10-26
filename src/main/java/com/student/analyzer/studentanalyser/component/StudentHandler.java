package com.student.analyzer.studentanalyser.component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.analyzer.studentanalyser.model.Student;
import com.student.analyzer.studentanalyser.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;

@Component
@Slf4j
@RequiredArgsConstructor
public class StudentHandler implements Function<String, String> {
    private final StudentService studentService;


    @Override
    public String apply(String input) {
        try {
            return studentService.saveAll(new ObjectMapper().readValue(input, new TypeReference<List<Student>>() {
            }));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
