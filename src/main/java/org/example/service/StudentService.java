package org.example.service;

import org.example.model.Student;
import org.example.proxy.NotifyStudents;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final NotifyStudents notifyStudents;

    @Autowired
    public StudentService(StudentRepository studentRepository, @Qualifier("smsNotification") NotifyStudents notifyStudents) {
        this.studentRepository = studentRepository;
        this.notifyStudents = notifyStudents;
        System.out.println("StudentService instance created");
    }

    public void registerStudent(Student student) {
        studentRepository.saveStudent(student);
        notifyStudents.sendNotification(student);
    }
    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
}





