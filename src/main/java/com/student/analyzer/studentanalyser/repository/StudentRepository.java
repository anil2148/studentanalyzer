package com.student.analyzer.studentanalyser.repository;

import com.student.analyzer.studentanalyser.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
