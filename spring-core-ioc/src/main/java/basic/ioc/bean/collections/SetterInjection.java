package basic.ioc.bean.collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

@Component
public class SetterInjection {

  private List<String> names;
  private Set<Long> phones;
  private Map<Long, String> phoneNameMap;

  @Autowired
  public void setNames(List<String> names) {
    this.names = names;
  }

  @Autowired
  public void setPhones(Set<Long> phones) {
    this.phones = phones;
  }

  @Autowired
  public void setPhoneNameMap(Map<Long, String> phoneNameMap) {
    this.phoneNameMap = phoneNameMap;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", SetterInjection.class.getSimpleName() + "[", "]")
        .add("names=" + names)
        .add("phones=" + phones)
        .add("phoneNameMap=" + phoneNameMap)
        .toString();
  }
}
