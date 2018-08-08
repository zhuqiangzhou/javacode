package com.zqz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.zqz.beans.Car;
import com.zqz.beans.Cat;

/**
 * bean的声明周期，创建--->初始化--->销毁
 * 初始化和销毁方法：init-method和destory-method
 * 
 * 
 * 构造（对象创建）
 * 		单实例：在容器启动的时候创建对象
 *  	多实例：在每次获取的时候创建对象
 *  
 * 初始化：对象创建完成，并赋值好，调用初始化方法
 * 销毁：单实例容器关闭的时候进行销毁
 * 	         多实例容器关闭的时候不会管理这个bean ，容器不会调用销毁方法
 * 
 * 通过Bean实现InitializingBean(定义初始化逻辑)
 * 			DisposableBean(定义销毁逻辑)
 * 
 * 可以使用JSR250
 * 		@PostConstruct 在bean创建完成并且属性赋值完成，来执行初始化方法
 * 		@PreDestroy 在容器销毁bean之前通知我们进行清理工作
 * 
 * BeanPostProcessor bean的后置处理器
 * 		在bean初始化前后进行一些处理工作
 * 		postProcessBeforeInitialization在初始化之前工作
 * 		postProcessAfterInitialization在初始化之后工作
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
