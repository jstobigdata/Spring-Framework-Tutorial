package com.jsbd.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {

  //TODO - Use setter based injection
  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  public void publishEvent(String message, Integer eventId) {
    applicationEventPublisher.publishEvent(
        new UserEvent(this, message, eventId)
    );
  }


}
