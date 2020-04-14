package com.jsbd.events.generic;

import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

import java.util.StringJoiner;

/**
 * Recommended to extend {@link ResolvableTypeProvider}.
 *
 * @param <T> - The generic message class.
 */
public class GenericEvent<T> implements ResolvableTypeProvider {
  private T message;
  private Object source;

  public GenericEvent(Object source, T message) {
    this.source = source;
    this.message = message;
  }

  @Override
  public ResolvableType getResolvableType() {
    return ResolvableType.forClassWithGenerics(
        getClass(), ResolvableType.forInstance(getSource())
    );
  }

  public T getMessage() {
    return message;
  }

  public Object getSource() {
    return source;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", GenericEvent.class.getSimpleName() + "[", "]")
        .add("message=" + message)
        .add("source=" + source)
        .toString();
  }

}
