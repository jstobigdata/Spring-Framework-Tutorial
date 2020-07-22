package com.jsbd.order;

import java.util.List;

import com.jsbd.order.model.NotificationChannel;
import com.jsbd.order.service.NotificationHandler;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ApplicationConfig.class)
public class TestOrderOnCollectionInjection {

  @Autowired
  private List<NotificationHandler> notificationHandlers;

  @Autowired
  private List<NotificationChannel> notificationChannels;

  @Test
  public void testAllChannelSendingOrder() {
    notificationHandlers.forEach(NotificationHandler::send);
  }

  @Test
  public void testNotificationChannelBeanOrder(){
    notificationChannels.forEach(channel -> System.out.println(channel.getName()));
  }

}
