package org.example.proxy;

import org.example.model.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SendEmailNotification implements NotifyStudents {
    @Override
    public void sendNotification(Student student) {
        System.out.println("Sending email to " + student.getEmail());
    }
}


