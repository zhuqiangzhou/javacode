package com.zqz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zqz.beans.Person;
import com.zqz.config.MainConfig;

public class MainTest {
	
	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//		Person bean = (Person) applicationContext.getBean("person");
//		System.out.println(bean);
		
		 ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		 Person person = applicationContext.getBean(Person.class);
		 System.out.println(person);
		 
		 String[] namesForType = applicationContext.getBeanNamesForType(Person.class);
		 for (String name : namesForType) {
			System.out.println(name);
		}
	}
}
	