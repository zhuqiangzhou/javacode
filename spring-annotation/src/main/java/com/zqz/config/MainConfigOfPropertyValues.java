package com.zqz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zqz.beans.Person;

//ʹ��@@PropertySource��ȡ�ⲿ�����ļ���k/v���浽���еĻ��������У��������ⲿ�������ļ��Ժ�ʹ��${}ȡ�������ļ���ֵ
@PropertySource(value={"classpath:/person.properties"})
@Configuration
public class MainConfigOfPropertyValues {
	
	@Bean
	public Person person() {
		return new Person();
	}
}
