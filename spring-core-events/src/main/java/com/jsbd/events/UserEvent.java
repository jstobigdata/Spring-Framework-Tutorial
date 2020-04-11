package com.jsbd.events;

import org.springframework.context.ApplicationEvent;

import java.util.StringJoiner;

public class CustomAppEvent extends ApplicationEvent {

  //Custom property
  private String message;

  /**
   * Create a new {@code ApplicationEvent}.
   * @param source the object on which the event initially occurred or with
   *               which the event is associated (never {@code null})
   */
  public CustomAppEvent(Object source) {
    super(source);
  }

  /**
   * Constructor to set the properties.
   * @param source
   * @param message
   */
  public CustomAppEvent(Object source, String message) {
    super(source);
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", CustomAppEvent.class.getSimpleName() + "[", "]")
        .add("message='" + message + "'")
        .add("source=" + source)
        .toString();
  }
}
