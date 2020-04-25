package c.jbd.saop.ar.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class DaoExpressions {

  //Match with only UserRepository
  @Pointcut("within(c.jbd.saop.ar.dao.UserRepository)")
  public void userDao() {}

  //Match with any find() method
  @Pointcut("execution(* find(..))")
  public void findMethod() {}

  @Pointcut("userDao() && findMethod()")
  public void userDaoFind(){}
}
