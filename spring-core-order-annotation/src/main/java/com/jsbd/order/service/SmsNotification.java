package com.jsbd.order.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1)
class SmsNotification implements NotificationHandler {

    public SmsNotification() {
        System.out.println("SmsNotification Service created.");
    }

    @Override
    public void send() {
        System.out.println("SMS Notification Handler");
    }

}