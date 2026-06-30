package com.example.core;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class PaymentService {

    public PaymentService() {
        System.out.println("1. Constructor of the PaymentService is called");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. The bean initialized");
    }

    public void processPayment() {
        System.out.println("3. Bean is being used.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("4. Bean is being destroyed.");
    }
}
