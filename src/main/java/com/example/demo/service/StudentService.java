package com.example.demo.service;

import com.example.demo.Model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public int addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public List<Student> getAllStudentsByUniversity(String university) {
        return studentRepository.getAllStudentsByUniversity(university);
    }

    public Student getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }
}
