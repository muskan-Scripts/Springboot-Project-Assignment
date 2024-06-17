package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class studentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public int addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getAllByUniversity")
    public List<Student> getAllStudentsByUniversity(@RequestParam String university) {
        return studentService.getAllStudentsByUniversity(university);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
}
