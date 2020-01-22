package basic.ioc.bean.collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

@Component
public class FieldInjection {
  @Autowired //Avoid using property injection
  private List<String> names;

  @Autowired //Avoid using property injection
  private Set<Long> phones;

  @Autowired //Avoid using property injection
  private Map<Long, String> phoneNameMap;

  @Override
  public String toString() {
    return new StringJoiner(", ", FieldInjection.class.getSimpleName() + "[", "]")
        .add("names=" + names)
        .add("phones=" + phones)
        .add("phoneNameMap=" + phoneNameMap)
        .toString();
  }
}
