package basic.ioc.wiring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ConfigWiring.class)
public class AutowiredTest {

  //Inject by Type
  @Autowired
  private PdfFileReader pdfFileReader;

  @Test
  public void injectByType() {
    Assert.assertNotNull(pdfFileReader);
    Assert.assertEquals(pdfFileReader.getClass(), PdfFileReader.class);
  }

  //Inject by @Qualifier
  @Autowired
  @Qualifier("wordFileReader")
  private FileReader fileReader;

  @Test
  public void injectByQualifier() {
    Assert.assertNotNull(fileReader);
    Assert.assertEquals(fileReader.getClass(), WordFileReader.class);
  }

  //Inject by Field name
  @Autowired
  private FileReader wordFileReader;

  @Test
  public void injectByFieldName() {
    Assert.assertNotNull(wordFileReader);
    Assert.assertEquals(wordFileReader.getClass(), WordFileReader.class);
  }

}
