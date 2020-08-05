package c.jbd.spring.resources;

import java.io.IOException;
import java.io.InputStream;

public class ReaderUtil {
  public static void readAndPrint(InputStream stream) throws IOException {
    int content = stream.read();
    System.out.println("\n============ start ===========");
    while (content != -1) {
      System.out.print((char) content);
      content = stream.read();
    }
    System.out.println("\n============ End ============");
    stream.close();
  }
}
