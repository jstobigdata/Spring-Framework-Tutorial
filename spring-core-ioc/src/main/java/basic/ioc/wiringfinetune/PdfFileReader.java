package basic.ioc.wiringfinetune;

    import org.springframework.context.annotation.Primary;
    import org.springframework.stereotype.Component;

@Primary
@Component
public class PdfFileReader implements FileReader {

  @Override
  public void print() {
    System.out.println("Inside PdfFileReader");
  }
}
