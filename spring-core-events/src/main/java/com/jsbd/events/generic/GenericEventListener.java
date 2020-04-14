package com.jsbd.events.generic;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class GenericEventListener {

  @EventListener
  public void listenEvent(GenericEvent event) {
    System.out.println(event);
  }
}
