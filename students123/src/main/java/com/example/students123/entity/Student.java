package com.example.students123.entity;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    private Long id; // You can add more fields as needed

    // Getters and setters for your entity fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Add getters and setters for other fields as needed
}
