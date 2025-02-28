package com.example.project.controller;

import com.example.project.modalls.Student;
import com.example.project.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/student")
public class MyController {
@Autowired

   private StudentRepository studentRepository;

    @PostMapping("/save")
    public ResponseEntity<?> addStudent(@RequestBody Student student)
    {
       Student save =  this.studentRepository.save(student);
       return ResponseEntity.ok(save);
    }
    @GetMapping("/display")
    public ResponseEntity<?> getStudent()
    {

        return ResponseEntity.ok(this.studentRepository.findAll());
    }
}
