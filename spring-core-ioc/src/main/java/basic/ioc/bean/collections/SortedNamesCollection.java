package basic.ioc.bean.collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.StringJoiner;

@Component
public class SortedNamesCollection {
  private List<NameBean> names;

  @Autowired
  public void setNames(List<NameBean> names) {
    this.names = names;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", SortedNamesCollection.class.getSimpleName() + "[", "]")
        .add("names=" + names)
        .toString();
  }
}
