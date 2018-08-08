package com.zqz.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zqz.config.MainConfigLifeCycle;

public class IOCTest_LifeCycle {
	
	@Test
	public void test() {
		 //创建ioc容器
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigLifeCycle.class);
		
		System.out.println("ioc容器创建完成");
		//Object bean = applicationContext.getBean("car");
		//System.out.println(bean);
		applicationContext.close();
	}
}	
