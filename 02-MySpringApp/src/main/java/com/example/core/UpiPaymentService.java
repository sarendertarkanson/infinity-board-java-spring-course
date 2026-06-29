package com.example.core;

import org.springframework.stereotype.Component;

@Component("upi")
public class UpiPaymentService implements PaymentService {
    @Override
    public void processPayment() {
        System.out.println("Payment process successfully with upi.");
    }
}
