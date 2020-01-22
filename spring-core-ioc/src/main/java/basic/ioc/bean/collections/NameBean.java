package basic.ioc.bean.collections;

import java.util.StringJoiner;

public class NameBean {

  private String name;

  public NameBean(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", NameBean.class.getSimpleName() + "[", "]")
        .add("name='" + name + "'")
        .toString();
  }
}
