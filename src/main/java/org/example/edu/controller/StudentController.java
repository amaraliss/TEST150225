package org.example.edu.controller;

import lombok.RequiredArgsConstructor;
import org.example.edu.model.Student;
import org.example.edu.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentRepository repository;
    private long countid = 0;

    @GetMapping("/student")
    public List<Student> getStudentList() {
        return repository.getStudentList();
    }

    @PostMapping("/student")
    public long saveStudent(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
        countid = countid + 1;
        Student savedStudent = new Student(countid, name, email, age);
        repository.save(savedStudent);
        return repository.save(savedStudent);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable long id) {
        return repository.getById(id);
    }
@DeleteMapping("/student/{id}")
    public void deleteStydentById(@PathVariable long id) {
        repository.deleteById(id);
}
}
