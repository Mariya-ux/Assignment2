package org.example;

import org.example.model.Student;
import org.example.service.StudentService;
import org.example.singleton.EagerSingleton;
import org.example.singleton.LazySingleton;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService studentService = context.getBean(StudentService.class);
        Student student1 = new Student();
        student1.setName("Alice");
        student1.setEmail("alice@example.com");
        student1.setAge(20);

        Student student2 = new Student();
        student2.setName("Bob");
        student2.setEmail("bob@example.com");
        student2.setAge(22);

        studentService.registerStudent(student1);
        studentService.registerStudent(student2);

        context.getBean(EagerSingleton.class);
        context.getBean(LazySingleton.class);
        context.close();
    }
}


