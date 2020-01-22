package basic.ioc.bean.collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import java.util.*;

@Configuration
@ComponentScan("basic.ioc.bean.collections")
public class CollectionsConfig {

  @Bean
  public List<String> namesList() {
    List names = new ArrayList<String>();
    names.add("Salman Khan");
    names.add("Hrithik Roshan");
    return names;
  }

  @Bean
  public Set<Long> numbersBean() {
    Set<Long> numbers = new HashSet<>();
    numbers.add(2222222222L);
    numbers.add(1212121212L);
    return numbers;
  }

  @Bean
  public Map<Long, String> phoneNameMapBean() {
    Map<Long, String> phoneNames = new HashMap<>();
    phoneNames.put(888888888888L, "Ram");
    phoneNames.put(777777777777L, "Bhim");
    return phoneNames;
  }

  @Bean
  public JbdBean jbdBean1(){
    JbdBean bean = new JbdBean();
    bean.setUuid(UUID.randomUUID().toString());
    return bean;
  }

  @Bean
  public JbdBean jbdBean2(){
    JbdBean bean = new JbdBean();
    bean.setUuid(UUID.randomUUID().toString());
    return bean;
  }

  @Bean @Order(3)
  public NameBean name1(){
    return new NameBean("John");
  }

  @Bean @Order(1)
  public NameBean name2(){
    return new NameBean("Ram");
  }

  @Bean @Order(2)
  public NameBean name3(){
    return new NameBean("Shyam");
  }

}
