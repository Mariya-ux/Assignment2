package org.example.singleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class EagerSingleton {
    public EagerSingleton() {
        System.out.println("EagerSingleton bean");
    }
}