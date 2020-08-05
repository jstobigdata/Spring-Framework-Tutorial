package c.jbd.spring.resources;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;

public class DefaultResourceLoaderExample {
  public static void main(String[] args) throws IOException {
    ResourceLoader resourceLoader = new DefaultResourceLoader();
    Resource r = resourceLoader.getResource("sample.md");
    ReaderUtil.readAndPrint(r.getInputStream());
  }
}
