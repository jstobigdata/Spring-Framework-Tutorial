package basic.ioc.wiringfinetune;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(ConfigWiring.class)
public class FineTuneAutowiring {

  @Autowired
  private FileReader fileReader;

  @Test
  public void testFileReader() {
    Assert.assertNotNull(fileReader);
    Assert.assertEquals(fileReader.getClass(), PdfFileReader.class);
  }

  @Autowired
  private Insurance insurance;

  @Test
  public void testInsuranceBean(){
    Assert.assertNotNull(insurance);
    Assert.assertEquals(insurance.getType(), "Health Insurance");
  }

  //With Qualifier
  @Autowired
  @Qualifier("wordFileReader")
  private FileReader fileReader2;

  @Test
  public void testWordFileReader() {
    Assert.assertNotNull(fileReader2);
    Assert.assertEquals(fileReader2.getClass(), WordFileReader.class);
  }

  @Autowired
  //@Qualifier("insurance3")
  @Qualifier("generalInsurance")
  private Insurance myInsurance;

  @Test
  public void testInsuranceWithQualifier(){
     Assert.assertNotNull(myInsurance);
     Assert.assertEquals("General Insurance", myInsurance.getType());
  }
}
