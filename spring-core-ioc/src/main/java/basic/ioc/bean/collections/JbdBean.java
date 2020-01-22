package basic.ioc.bean.collections;

import java.util.StringJoiner;

public class JbdBean {

  private String uuid;

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", JbdBean.class.getSimpleName() + "[", "]")
        .add("uuid='" + uuid + "'")
        .toString();
  }
}
