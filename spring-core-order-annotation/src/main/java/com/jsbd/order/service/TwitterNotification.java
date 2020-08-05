package com.jsbd.order.service;

import org.springframework.stereotype.Service;

@Service
// Not an Ordered Service, will be the last in sequence
class TwitterNotification implements NotificationHandler {

    public TwitterNotification() {
        System.out.println("TwitterNotification Service created.");
    }

    @Override
    public void send() {
        System.out.println("Twitter Direct Message Notification Handler");
    }

}