package c.jbd.spring.resources;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;

public class ResourcesExample {
  public static void main(String[] args) throws IOException {
    Resource urlResource
      = new UrlResource("https://google.com");
    ReaderUtil.readAndPrint(urlResource.getInputStream());

    Resource classPathResource = new ClassPathResource("sample.md");
    ReaderUtil.readAndPrint(classPathResource.getInputStream());

    //FileSystemResource fileResource = new FileSystemResource("PathToFile/filename");
    //readAndPrint(fileResource.getInputStream());
  }


}
