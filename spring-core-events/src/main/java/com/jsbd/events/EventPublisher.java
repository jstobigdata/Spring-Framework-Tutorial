package com.jsbd.events.synchronous;

import com.jsbd.events.UserEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

  @Autowired //use setter based injection
  private ApplicationEventPublisher applicationEventPublisher;

  public void publishEvent(String message, Integer eventId) {
    applicationEventPublisher.publishEvent(
        new UserEvent(this, message, eventId )
    );
  }
}
