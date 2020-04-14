package com.jsbd.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<UserEvent> {

  @Override
  public void onApplicationEvent(UserEvent event) {
    System.out.println("======= UserEvent Listener =======");
    System.out.println(event);
  }
}
