package com.example.core;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PaymentService {
    public void processPayment() {
        System.out.println("Payment process successfully.");
    }

    ;
}
