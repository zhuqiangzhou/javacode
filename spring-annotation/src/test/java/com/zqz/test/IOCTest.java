package com.zqz.test;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.zqz.beans.Person;
import com.zqz.config.MainConfig;
import com.zqz.config.MainConfig2;

public class IOCTest {
	
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

	private void print(AnnotationConfigApplicationContext applicationContext) {
		String[] names = applicationContext.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}
	
	@SuppressWarnings("resource")
	@Test
	public void test() {
		print(applicationContext);
	}

	
	@Test
	public void test01() {
//		String[] names = applicationContext.getBeanDefinitionNames();
//		for (String name : names) {
//			System.out.println(name);
//		}
		System.out.println("ioc容器创建完成"); 
		Object bean = applicationContext.getBean("person");
		Object bean1 = applicationContext.getBean("person");
//		System.out.println(bean==bean1);
	}
	
	@Test
	public void test02() {
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		//动态获取环境变量的值。windows 7
		String property = environment.getProperty("os.name");
		System.out.println(property);
		String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
		for (String name : namesForType) {
			System.out.println(name);
		} 
		Map<String, Person> person = applicationContext.getBeansOfType(Person.class);
		System.out.println(person);
	}
	
	@Test
	public void testImport() {
		print(applicationContext);
	}
}
