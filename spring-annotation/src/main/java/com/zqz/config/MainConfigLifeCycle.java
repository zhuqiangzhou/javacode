package com.zqz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.zqz.beans.Car;
import com.zqz.beans.Cat;

/**
 * bean���������ڣ�����--->��ʼ��--->����
 * ��ʼ�������ٷ�����init-method��destory-method
 * 
 * 
 * ���죨���󴴽���
 * 		��ʵ����������������ʱ�򴴽�����
 *  	��ʵ������ÿ�λ�ȡ��ʱ�򴴽�����
 *  
 * ��ʼ�������󴴽���ɣ�����ֵ�ã����ó�ʼ������
 * ���٣���ʵ�������رյ�ʱ���������
 * 	         ��ʵ�������رյ�ʱ�򲻻�������bean ����������������ٷ���
 * 
 * ͨ��Beanʵ��InitializingBean(�����ʼ���߼�)
 * 			DisposableBean(���������߼�)
 * 
 * ����ʹ��JSR250
 * 		@PostConstruct ��bean������ɲ������Ը�ֵ��ɣ���ִ�г�ʼ������
 * 		@PreDestroy ����������bean֮ǰ֪ͨ���ǽ���������
 * 
 * BeanPostProcessor bean�ĺ��ô�����
 * 		��bean��ʼ��ǰ�����һЩ������
 * 		postProcessBeforeInitialization�ڳ�ʼ��֮ǰ����
 * 		postProcessAfterInitialization�ڳ�ʼ��֮����
 * 
 * @author xg
 * 
 */
@ComponentScan("com.zqz.beans")
@Configuration
public class MainConfigLifeCycle {
	
	// @Scope("prototype")
	@Bean(initMethod="init",destroyMethod="destroy")
	public Car car() {
		return new Car();
	}
}
