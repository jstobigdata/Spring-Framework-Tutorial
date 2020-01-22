package basic.ioc.bean.collections;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCollectionsIoC {

  @Test
  public void testCollectionsMapping(){
      ApplicationContext aContext
          = new AnnotationConfigApplicationContext(CollectionsConfig.class);

      ConstructorInjection cInjection = aContext.getBean(ConstructorInjection.class);
      System.out.println(cInjection);

      FieldInjection pInjection = aContext.getBean(FieldInjection.class);
      System.out.println(pInjection);

      SetterInjection setterInjection = aContext.getBean(SetterInjection.class);
      System.out.println(setterInjection);
  }

  @Test
  public void testBeanReferenceCollections(){
    ApplicationContext aContext
        = new AnnotationConfigApplicationContext(CollectionsConfig.class);

    BeanReferenceCollections beanReferCollections = aContext.getBean(BeanReferenceCollections.class);
    System.out.println(beanReferCollections);
  }

  @Test
  public void testSortedCollection(){
    ApplicationContext aContext
        = new AnnotationConfigApplicationContext(CollectionsConfig.class);

    SortedNamesCollection collection = aContext.getBean(SortedNamesCollection.class);
    System.out.println(collection);
  }
}

