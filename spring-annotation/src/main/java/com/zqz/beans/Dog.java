package com.zqz.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Dog {
	
	public Dog() {
		System.out.println("Dog constructor");
	}
	
	@PostConstruct //���󴴽�����ֵ֮�����
	public void init() {
		System.out.println("Dog PostConstructor");
	}
	
	@PreDestroy //�����Ƴ�����֮ǰ
	public void destroy() {
		System.out.println("Dog PreDestroy");
	}
}
