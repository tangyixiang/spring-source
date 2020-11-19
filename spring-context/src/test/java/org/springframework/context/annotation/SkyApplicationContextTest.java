package org.springframework.context.annotation;

import example.scannable.FooDao;
import example.scannable.StubFooDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

public class SkyApplicationContextTest {

	@Test
	public void load() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("simpleConfigTests.xml", getClass());
		assertTrue(applicationContext.containsBean("fooServiceImpl"));
		FooDao stubFooDao = (FooDao)applicationContext.getBean("stubFooDao");
		System.out.println(stubFooDao);
		System.out.println(stubFooDao.findFoo(1));
		applicationContext.close();
	}

}
