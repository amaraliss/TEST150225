package org.example.edu.repository;

import org.example.edu.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}