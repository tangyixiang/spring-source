package example.scannable;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class StubFooDaoAop {

//	@Before("method()")
	public void executeBefore() {
		System.out.println("this is before work");
	}

//	@Pointcut("execution(* example.scannable.StubFooDao.findFoo(..))")
	public void method() {

	}

}
