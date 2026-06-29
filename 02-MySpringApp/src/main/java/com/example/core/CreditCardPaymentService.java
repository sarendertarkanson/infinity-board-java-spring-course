package com.example.core;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentService implements PaymentService {

    public void processPayment() {
        System.out.println("Payment process successfully with credit card.");
    }

}
