package basic.ioc.wiring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.inject.Inject;
import javax.inject.Named;

@SpringJUnitConfig(ConfigWiring.class)
public class InjectTest {

  //Inject by Type
  @Inject
  private PdfFileReader fileReader;

  @Test
  public void injectByType() {
    Assert.assertNotNull(fileReader);
    Assert.assertEquals(fileReader.getClass(), PdfFileReader.class);
  }

  //Inject by @Qualifier
  @Inject
  @Qualifier("wordFileReader")
  private FileReader fileReader3;

  @Test
  public void injectByQualifier() {
    Assert.assertNotNull(fileReader3);
    Assert.assertEquals(fileReader3.getClass(), WordFileReader.class);
  }

  //Inject by name with @Named annotation
  @Inject
  @Named("pdfFileReader")
  private FileReader fileReader2;

  @Test
  public void injectByName() {
    Assert.assertNotNull(fileReader2);
    Assert.assertEquals(fileReader2.getClass(), PdfFileReader.class);
  }

  //Inject by field Name
  @Inject
  private FileReader wordFileReader;

  @Test
  public void injectByName2() {
    Assert.assertNotNull(wordFileReader);
    Assert.assertEquals(wordFileReader.getClass(), WordFileReader.class);
  }

  //Check precedence - Don't do this
  //TODO - Uncomment the below line and check what happens
  /*@Inject
  @Qualifier("pdfFileReader")
  @Named("wordFileReader")
  private FileReader pdfFileReader;

  @Test
  public void checkPrecedence() {
    Assert.assertNotNull(pdfFileReader);
    Assert.assertEquals(pdfFileReader.getClass(), PdfFileReader.class);
  }*/
}
