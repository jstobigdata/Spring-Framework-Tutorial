package com.jbd.spring.fieldlevel;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public class Person {
  @NonNull
  private Long id;
  @NonNull
  private String name;
  @Nullable
  private String email;

  public Person(@NonNull Long id, @NonNull String name, @Nullable String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  @NonNull
  public Long getId() {
    return id;
  }

  public Person setId(@NonNull Long id) {
    this.id = id;
    return this;
  }

  @NonNull
  public String getName() {
    return name;
  }

  public Person setName(@NonNull String name) {
    this.name = name;
    return this;
  }

  @Nullable
  public String getEmail() {
    return email;
  }

  public Person setEmail(@Nullable String email) {
    this.email = email;
    return this;
  }
}
