package com.example;

import com.example.config.AppConfig;
import com.example.core.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringAppApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentService bean1 = context.getBean(PaymentService.class);
        PaymentService bean2 = context.getBean(PaymentService.class);

        System.out.println(bean1 == bean2);

        context.close();
    }

}
