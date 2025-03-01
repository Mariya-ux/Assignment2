package org.example.singleton;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
@Lazy
public class LazySingleton {
    public LazySingleton() {
        System.out.println("LazySingleton bean ");
    }
}

