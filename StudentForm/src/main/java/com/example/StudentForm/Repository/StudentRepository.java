package com.example.StudentForm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentForm.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
