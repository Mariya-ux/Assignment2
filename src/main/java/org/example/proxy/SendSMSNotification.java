package org.example.proxy;

import org.example.model.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("smsNotification")
public class SendSMSNotification implements NotifyStudents {
    @Override
    public void sendNotification(Student student) {
        System.out.println("Sending SMS to " + student.getName());
    }
}


