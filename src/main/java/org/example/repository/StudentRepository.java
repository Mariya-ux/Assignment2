package org.example.repository;

import org.example.model.Student;

import java.util.List;

public interface StudentRepository {
    void saveStudent(Student student);

    List<Student> getAllStudents();
}
