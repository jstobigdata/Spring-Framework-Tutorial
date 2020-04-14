package com.jsbd.events.synchronous;

import com.jsbd.events.AppConfig;
import com.jsbd.events.EventPublisher;
import com.jsbd.events.UserEvent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
//@EnableAsync
class EventPublisherTest {

  @Autowired
  EventPublisher eventPublisher;

  @Test
  public void sendSynchronousEvent() {
    eventPublisher.publishEvent("User registered", 101);
  }

  @Test
  public void conditionalEvent() {
    eventPublisher.publishEvent("User logged in", 102);
  }

  @Test
  public void sendAsyncEvent() throws InterruptedException {
    //eventMulticaster.multicastEvent(new UserEvent(this, "User Logged out", 103));
    Thread.sleep(10000);
  }

}