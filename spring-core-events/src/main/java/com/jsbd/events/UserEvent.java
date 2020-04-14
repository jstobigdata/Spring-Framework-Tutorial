package com.jsbd.events;

import org.springframework.context.ApplicationEvent;

import java.util.StringJoiner;

public class UserEvent extends ApplicationEvent {

  //Custom property
  private String message;

  //Custom property
  private Integer eventId;

  /**
   * Create a new {@code ApplicationEvent}.
   *
   * @param source the object on which the event initially occurred or with
   *               which the event is associated (never {@code null})
   */
  public UserEvent(Object source) {
    super(source);
  }

  /**
   * Constructor to set the properties.
   *
   * @param source
   * @param message
   */
  public UserEvent(Object source, String message,
                   Integer eventId) {
    super(source);
    this.message = message;
    this.eventId = eventId;
  }

  public String getMessage() {
    return this.message;
  }

  public Integer getEventId() {
    return this.eventId;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", UserEvent.class.getSimpleName() + "[", "]")
        .add("message='" + message + "'")
        .add("source=" + source)
        .add("eventId=" + eventId)
        .toString();
  }

}
