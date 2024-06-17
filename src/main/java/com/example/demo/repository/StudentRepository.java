package com.example.demo.repository;

import com.example.demo.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> students = new ArrayList<>();

    public int addStudent(Student student) {
        students.add(student);
        return students.size(); // Return the index as ID
    }

    public List<Student> getAllStudentsByUniversity(String university) {
        List<Student> studentsByUniversity = new ArrayList<>();
        for (Student student : students) {
            if (student.getUniversity().equalsIgnoreCase(university)) {
                studentsByUniversity.add(student);
            }
        }
        return studentsByUniversity;
    }

    public Student getStudentById(int id) {
        if (id >= 0 && id < students.size()) {
            return students.get(id);
        }
        return null;
    }
}
