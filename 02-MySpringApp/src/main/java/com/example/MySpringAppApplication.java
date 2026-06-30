package com.example;

import com.example.config.AppConfig;
import com.example.core.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringAppApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
