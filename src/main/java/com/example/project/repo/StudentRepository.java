package com.example.project.repo;

import com.example.project.modalls.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository <Student, Integer> {
}
