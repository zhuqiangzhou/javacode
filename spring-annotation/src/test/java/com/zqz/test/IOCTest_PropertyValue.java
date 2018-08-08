package com.zqz.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zqz.beans.Person;
import com.zqz.config.MainConfigOfPropertyValues;

public class IOCTest_PropertyValue {
	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValues.class);
	
	@Test
	public void test(){
		print(applicationContext);
		System.out.println("=====================");
		Person bean = (Person) applicationContext.getBean("person");
		System.out.println(bean);
		applicationContext.close();
	}
	
	private void print(AnnotationConfigApplicationContext applicationContext) {
		String[] names = applicationContext.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name);
		}
	}
}
