package com.spring_boot.project_spring_boot.controllers;

import com.spring_boot.project_spring_boot.data.models.Student;
import com.spring_boot.project_spring_boot.data.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    final
    StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id) {
        return studentRepo.findById(id).orElse(null);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @GetMapping("/grade/{grade}")
    public List<Student> getStudentsByGrade(@PathVariable String grade) {
        return studentRepo.findByGrade(grade);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentRepo.deleteById(id);
    }
}