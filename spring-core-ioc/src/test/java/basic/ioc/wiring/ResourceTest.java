package basic.ioc.wiring;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;

@SpringJUnitConfig(ConfigWiring.class)
public class ResourceTest {

  //Uncomment and show the exception that gets reproduced
  //@Resource
  //private FileReader fReader;

  //Resolve by property name
  @Resource
  private FileReader pdfFileReader;

  @Test
  public void resolveByPropertyName() {
    Assert.assertNotNull(pdfFileReader);
    Assert.assertEquals(pdfFileReader.getClass(), PdfFileReader.class);
  }

  //Resolve by explicit name
  @Resource(name = "wordFileReader")
  private FileReader reader;

  @Test
  public void resolveByExplicitName() {
    Assert.assertNotNull(reader);
    Assert.assertEquals(reader.getClass(), WordFileReader.class);
  }

  //Resolve by type auto detection
  @Resource
  private WordFileReader fileReader;

  @Test
  public void resolveByAutoType(){
    Assert.assertNotNull(fileReader);
    Assert.assertEquals(fileReader.getClass(), WordFileReader.class);
  }

  //Resolve by explicit Type
  @Resource(type = PdfFileReader.class)
  private FileReader fileReader2;

  @Test
  public void resolveByExplicitType() {
    Assert.assertNotNull(fileReader2);
    Assert.assertEquals(fileReader2.getClass(), PdfFileReader.class);
  }

  //Resolve by Qualifier
  @Qualifier("pdfFileReader")
  @Resource
  private FileReader myFileReader;

  @Test
  public void resolveByQualifier(){
    Assert.assertNotNull(myFileReader);
    Assert.assertEquals(myFileReader.getClass(), PdfFileReader.class);
  }
}
