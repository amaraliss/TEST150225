package org.example.edu.controller;

import org.example.edu.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping ("/hello")
    public String hello(@RequestParam String name) {
        return "Hello" + name;
    }
    @GetMapping("/student")
    public Student getStudent() {
        Student st = new Student(1,"Valera","Valerik@ya.ru",19);
        return st;
    }
}
