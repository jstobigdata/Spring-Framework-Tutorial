package basic.ioc.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;
import java.util.UUID;

@Component
@Scope("prototype")
public class Store {
  private String id;

  /* Field injection is not recommended. Instead use, Constructor
    or Setter injection
   */
  @Autowired
  private Item item;

  public Store() {
    id = UUID.randomUUID().toString();
  }

  public Store(String id, Item item) {
    this.id = id;
    this.item = item;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Item getItem() {
    return item;
  }

  public void setItem(Item item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Store.class.getSimpleName() + "[", "]")
        .add("id=" + id)
        .add("item=" + item)
        .toString();
  }
}
