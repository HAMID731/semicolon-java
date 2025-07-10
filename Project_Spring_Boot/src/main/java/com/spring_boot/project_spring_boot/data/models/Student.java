package com.spring_boot.project_spring_boot.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students") // This tells MongoDB the name of the 'folder' to store students
@Data
public class Student {
    @Id
    private String id; // Unique ID for each student (MongoDB creates this automatically if you don't set it)
    private String name;
    private int age;
    private String grade;
}