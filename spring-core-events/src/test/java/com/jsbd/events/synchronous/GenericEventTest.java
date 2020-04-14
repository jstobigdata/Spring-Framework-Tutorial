package com.jsbd.events.synchronous;

import com.jsbd.events.AppConfig;
import com.jsbd.events.generic.GenericEvent;
import com.jsbd.events.generic.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(AppConfig.class)
public class GenericEventTest {
  @Autowired
  private ApplicationEventPublisher eventPublisher;

  @Test
  public void publishEvent() {
    GenericEvent event1 = new GenericEvent<>(this, new Person("John"));
    GenericEvent event2 = new GenericEvent<>(this, "Hello");
    eventPublisher.publishEvent(event1);
    eventPublisher.publishEvent(event2);
  }
}