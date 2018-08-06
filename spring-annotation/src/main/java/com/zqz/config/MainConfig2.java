package com.zqz.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.zqz.beans.Color;
import com.zqz.beans.Person;
import com.zqz.beans.Red;
import com.zqz.condition.LinuxCondition;
import com.zqz.condition.WindowsCondition;
@Conditional({WindowsCondition.class})
@Configuration
@Import({Color.class,Red.class})
public class MainConfig2 {
	
	//默认是单实例的
	/**
	 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
	 * @return
	 * 
	 * prototype 多实例的 ；ioc容器启动并不会调用方法创建对象放在容器中，每次获取的时候才会调用方法去创建对象
	 * singleton 单实例的(默认) ioc容器启动会调用方法创建对象放到ioc容器中，以后每次获取就是从容器中拿（map.get）
	 * 
	 * 
	 * 懒加载
	 * 		单实例bean，默认在容器启动的时候创建对象
	 * 		懒加载：容器启动的时候不创建对象，第一次使用(获取)bean的时候创建对象，并初始化
	 */
	@Lazy
	@Scope  
	@Bean("person")
	public Person person() {
		System.out.println("给容器中添加一个person");
		return new Person("赵柳",20);
	}
	
	/**
	 * @Conditional ,按照一定的条件进行判断，满足条件给容器中注册bean
	 * 如果系统是windows，就给容器中注册bill
	 * 如果系统是linux，就给容器中注册linus
	 */

	@Bean("bill")
	public Person person01() {
		return new Person("Bill Gates",70);
	}
	
	@Conditional({LinuxCondition.class})
	@Bean("linus")
	public Person person02() {
		return new Person("linus",67);
	}
	
	/**
	 * 给容器中注册组件
	 * 1）包扫描+组件标注注解（@Controller、@Service、@Componen..）[自己写的类]
	 * 2)@Bean[导入的第三方包里面的组件]
	 * 3）@Import[快速给容器中导入一个组件]
	 * 
	 */
}
