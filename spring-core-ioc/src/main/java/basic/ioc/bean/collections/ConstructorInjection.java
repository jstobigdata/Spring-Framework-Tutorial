package basic.ioc.bean.collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

@Component
public class ConstructorInjection {

  private List<String> names;
  private Set<Long> phones;
  private Map<Long, String> phoneNameMap;

  @Autowired
  public ConstructorInjection(List<String> names, Set<Long> phones,
                              Map<Long, String> phoneNameMap) {
    this.names = names;
    this.phones = phones;
    this.phoneNameMap = phoneNameMap;
  }

  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }

  public Set<Long> getPhones() {
    return phones;
  }

  public void setPhones(Set<Long> phones) {
    this.phones = phones;
  }

  public Map<Long, String> getPhoneNameMap() {
    return phoneNameMap;
  }

  public void setPhoneNameMap(Map<Long, String> phoneNameMap) {
    this.phoneNameMap = phoneNameMap;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", ConstructorInjection.class.getSimpleName() + "[", "]")
        .add("names=" + names)
        .add("phones=" + phones)
        .add("phoneNameMap=" + phoneNameMap)
        .toString();
  }
}
