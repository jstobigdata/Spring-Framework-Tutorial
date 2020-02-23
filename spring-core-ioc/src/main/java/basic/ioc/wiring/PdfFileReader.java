package basic.ioc.wiring;

import org.springframework.stereotype.Component;

@Component
public class PdfFileReader extends FileReader {

  @Override
  public void print() {
    System.out.println("Inside PdfFileReader");
  }
}
