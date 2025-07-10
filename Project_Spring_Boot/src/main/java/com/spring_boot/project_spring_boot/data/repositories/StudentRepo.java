package com.spring_boot.project_spring_boot.data.repositories;

import com.spring_boot.project_spring_boot.data.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface StudentRepo extends MongoRepository<Student, String> {
    List<Student> findByGrade(String grade); // You can add special search methods like this!
}