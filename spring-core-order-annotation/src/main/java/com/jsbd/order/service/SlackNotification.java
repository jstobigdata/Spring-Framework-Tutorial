package com.jsbd.order.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(2)
class SlackNotification implements NotificationHandler {

    public SlackNotification() {
        System.out.println("SlackNotification Service created.");
    }

    @Override
    public void send() {
        System.out.println("Slack Notification Handler");
    }

}