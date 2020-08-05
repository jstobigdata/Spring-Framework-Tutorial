package com.jsbd.order.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(3)
public class EmailNotification implements NotificationHandler {

    public EmailNotification() {
        System.out.println("EmailNotification Service Created.");
    }

    @Override
    public void send() {
        System.out.println("Email Notification Handler");
    }

}