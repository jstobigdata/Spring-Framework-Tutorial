package basic.ioc.wiringfinetune;

import org.springframework.stereotype.Component;

@Component
public class WordFileReader implements FileReader {

  @Override
  public void print() {
    System.out.println("Inside WordFileReader");
  }
}
