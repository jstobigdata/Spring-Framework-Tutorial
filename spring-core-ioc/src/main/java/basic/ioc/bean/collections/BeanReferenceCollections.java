package basic.ioc.bean.collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.StringJoiner;

@Component
public class BeanReferenceCollections {

  private List<JbdBean> list;

  @Autowired
  public void setList(List<JbdBean> list) {
    this.list = list;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", BeanReferenceCollections.class.getSimpleName() + "[", "]")
        .add("list=" + list)
        .toString();
  }
}
