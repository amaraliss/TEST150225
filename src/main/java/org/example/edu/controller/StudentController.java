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


    @GetMapping("/student")
    public List<Student> getStudentList() {
        return repository.findAll();
    }

    @PostMapping("/student")
    public long saveStudent(@RequestParam String name, @RequestParam String email, @RequestParam int age) {
        Student savedStudent = new Student( name, email, age);
        repository.save(savedStudent);
        return repository.save(savedStudent).getId();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable long id) {
        return repository.getById(id);
    }
@DeleteMapping("/student/{id}")
    public void deleteStydentById(@PathVariable long id) {
        repository.deleteById(id);
}

@PutMapping("/student/{id}")
    public Student updateStudent(@PathVariable long id, @RequestBody Student st) {
        Student student = repository.findById(id).get();
        student.setName(st.getName());
        student.setAge(st.getAge());
        student.setEmail(st.getEmail());
        return repository.save(student);
}
}


