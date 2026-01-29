package com.example.StudentForm.Contoller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.StudentForm.Entity.Student;
import com.example.StudentForm.Repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentrepository;

    // 📖 READ
    @GetMapping("/students")
    public String getStudents(Model model) {
        List<Student> students = studentrepository.findAll();
        model.addAttribute("students", students);
        return "student-list";
    }

    // ➕ CREATE FORM
    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    // ➕ CREATE & ✏️ UPDATE
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentrepository.save(student);
        return "redirect:/students";
    }

    // ✏️ UPDATE FORM
    @GetMapping("/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        Student student = studentrepository.findById(id).orElseThrow();
        model.addAttribute("student", student);
        return "student-form";
    }

    // ❌ DELETE
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentrepository.deleteById(id);
        return "redirect:/students";
    }
}
