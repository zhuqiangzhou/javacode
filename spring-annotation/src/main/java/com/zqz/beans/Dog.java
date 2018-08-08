package com.zqz.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dog {
	
	public Dog() {
		System.out.println("Dog constructor");
	}
	
	@PostConstruct //对象创建并赋值之后调用
	public void init() {
		System.out.println("Dog PostConstructor");
	}
	
	@PreDestroy //容器移除对象之前
	public void destroy() {
		System.out.println("Dog PreDestroy");
	}
}
