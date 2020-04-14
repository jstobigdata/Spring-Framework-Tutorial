package com.jsbd.events;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AnnEventListener {

  //Event Listener with a Spring SpEL expression
  @EventListener(condition = "#userEvent.eventId == 102")
  public void processEvent(UserEvent userEvent) {
    System.out.println("====== Conditional UserEvent Listener =====");
    System.out.println(userEvent);
  }

  @EventListener
  public void genericListener(UserEvent userEvent) {
    System.out.println("\n===== General UserEvent Listener =====");
    System.out.println(userEvent);
  }

  //Async Event listener
  @EventListener
  @Async
  public void asyncListener(UserEvent userEvent) {
    System.out.println("===== Async UserEvent Listener =====");
    System.out.println(userEvent);
  }

}
