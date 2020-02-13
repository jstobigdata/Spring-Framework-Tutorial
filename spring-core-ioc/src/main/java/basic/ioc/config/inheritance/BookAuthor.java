package basic.ioc.config.inheritance;

import java.util.StringJoiner;

public class BookAuthor extends Author {

  private String bookName;

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", BookAuthor.class.getSimpleName() + "[", "]")
        .add(super.toString())
        .toString();
  }
}
