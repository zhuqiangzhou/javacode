package com.zqz.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.zqz.beans.Boss;
import com.zqz.beans.Car;
import com.zqz.beans.Color;
import com.zqz.config.MainConfigOfAutowired;
import com.zqz.dao.BookDao;
import com.zqz.service.BookService;

public class IOCTest_Autowired {
	
	@Test
	public void test() {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);
		BookService bookService = applicationContext.getBean(BookService.class);
		System.out.println(bookService.toString());
		
//		BookDao bookDao = applicationContext.getBean(BookDao.class);
//		System.out.println(bookDao);
		
		Boss boss = applicationContext.getBean(Boss.class);
		System.out.println(boss);
		
		Car car = applicationContext.getBean(Car.class);
		System.out.println(car);
		
		Color color = applicationContext.getBean(Color.class);
		System.out.println(color);
		
		System.out.println(applicationContext);
		applicationContext.close();
	}	
}
