package com.zqz.beans;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author 96300
 *
 */
public class Person {
	
	//使用value赋值
	//1.基本数值
	//2.可以写spEL；#{}
	//3、可以写${}，取出配置文件中[properties]的值（在运行环境变量里面的值）	
	@Value("大圣")
	private String name;
	
	@Value("#{20-2}")
	private Integer age;
	
	@Value("${person.nickName}")
	private String nickName;
		
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", nickName=" + nickName + "]";
	}
	
	
}
