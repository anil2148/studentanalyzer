package com.student.analyzer.studentanalyser.model;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document("student")
public record Student(
        String name,
        int rollNumber,
        String studentClass,     // e.g. "1st Year", "2nd Year"
        String departmentId,
        String hostelId,
        List<Subject> subjects,
        List<History> history,
        Address address
) { }
