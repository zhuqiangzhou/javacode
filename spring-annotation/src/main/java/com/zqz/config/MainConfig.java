package com.zqz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import com.zqz.beans.Person;

//配置类==配置文件
@Configuration   //告诉spring这是一个配置类
@ComponentScans(
		@ComponentScan(value="com.zqz",includeFilters = {
//				@Filter(type=FilterType.ANNOTATION,classes={Controller.class})},useDefaultFilters=false)	
				@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})},useDefaultFilters=false)
		)
//@ComponentScan value:指定要扫描的包
//excludeFilters = Filter[]   指定扫描的时候按照什么规则排除那些组件
//includeFilters = Filter[]   指定扫描的时候只需要包含那些组件   如果想让includeFilters生效，必须让useDefaultFilters=true
//FilterType.annotation:按照注解
//FilterType.ASSIGNABLE_TYPE:按照给定类型
//FilterType.ASPECTJ:按照aspectJ表达式
//FilterType.REGEX:使用正则表达式
//FilterType.CUSTOM:
public class MainConfig {
	
	@Bean("person") //给容器中注册一个Bean,类型为返回值的类型,id默认是用方法名作为id
	public Person person04() {
		return new Person("lisi",10);
	}
}
