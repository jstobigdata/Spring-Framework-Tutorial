package com.jsbd.order;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.jsbd.order.model.NotificationChannel;

@Configuration
@ComponentScan("com.jsbd.order")
public class ApplicationConfig {


    @Bean
    @Order(2)
    public NotificationChannel email(){
        // System.out.println("Notification Channel - Email");
        return new NotificationChannel("Email");
    }

    @Bean
    @Order(4)
    public NotificationChannel twitter(){
        // System.out.println("Notification Channel - Twitter");
        return new NotificationChannel("Twitter");
    }

    @Bean
    @Order(3)
    public NotificationChannel slack(){
        // System.out.println("Notification Channel - Slack");
        return new NotificationChannel("Slack");
    }

    @Bean
    @Order(1)
    public NotificationChannel sms(){
        // System.out.println("Notification Channel - Sms");
        return new NotificationChannel("Sms");
    }

}
