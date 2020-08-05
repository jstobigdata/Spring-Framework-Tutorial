package c.jbd.spring.resources.loader;

import c.jbd.spring.resources.ReaderUtil;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("jbdResourceLoader")
public class JbdResourceLoader implements ResourceLoaderAware {
  private ResourceLoader resourceLoader;

  public void setResourceLoader(ResourceLoader resourceLoader) {
    this.resourceLoader = resourceLoader;
  }

  public void loadResource(String resourcePath) throws IOException {
    Resource resource = resourceLoader.getResource(resourcePath);
    ReaderUtil.readAndPrint(resource.getInputStream());
  }
}
