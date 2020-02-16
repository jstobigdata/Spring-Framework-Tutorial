package core.bean.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class TraceBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.println("Inside postProcessBeforeInitialization - " + beanName);
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName)
      throws BeansException {
    System.out.println("Inside postProcessAfterInitialization - " + beanName);
    return bean;
  }
}
