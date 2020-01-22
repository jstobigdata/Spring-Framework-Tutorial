package basic.ioc.setter.xml;

import java.util.StringJoiner;

public class Store {
  private String id;
  private Item item;

  public Store() {
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
