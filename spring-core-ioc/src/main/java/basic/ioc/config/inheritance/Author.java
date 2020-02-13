package basic.ioc.config.inheritance;

import java.util.StringJoiner;

public abstract class Author {

  private String name;
  private Integer age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Author.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .add("age=" + age)
        .toString();
  }
}
