package com.zqz.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zqz.dao.BookDao;

/**
 * 自动装配；
 * 		spring利用依赖注入（DI），完成对IOC容器中各个组件的依赖关系赋值
 * 1、@autowired:自动注入
 * 		1）默认优先按照类型去容器中找对应组件：applicationContext.getBean(..)，找到就赋值
 * 		2)如果找到多个相同类型的组件，再将属性的名称作为组件的id去容器中查找
 * 		3)@Qualifier:使用此注解需要指定装配的组件id。而不是使用属性名	
 * 		4）自动装配默认一定要将属性赋好值，否则会报错
 * 		5)@Primary:让spring进行装配的，默认使用首选的bean,也可以继续使用@qualifier指定需要装配的bean的名字
 * 
 * 2、spring还支持使用@Resource(JSR250)和@Inject(JSR330)这两个注解是java规范的注解
 * 			@Resource:可以和@autowired一样实现自动装配功能，默认是按照组件名称装配
 * 			不支持@Primary功能，不支持@Autowired(required=false)功能
 * 			
 * 			@Inject :需要导入javax inject依赖，和@Autowired功能相同，没有required=false功能
 * 
 * 	AutowiredAnnotationBeanPostProcessor：解析完成自动装配功能
 * @author xg
 *
 */
@Configuration
@ComponentScan({"com.zqz.controller","com.zqz.service","com.zqz.dao"})
public class MainConfigOfAutowired {
	
	@Primary
	@Bean("bookDao2")
	public BookDao bookDao() {
		BookDao bookDao = new BookDao();
		bookDao.setLabel("2");
		return  bookDao;
	}
}
