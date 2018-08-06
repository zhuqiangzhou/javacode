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
	
	//Ĭ���ǵ�ʵ����
	/**
	 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
	 * @see ConfigurableBeanFactory#SCOPE_SINGLETON
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
	 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
	 * @return
	 * 
	 * prototype ��ʵ���� ��ioc����������������÷�������������������У�ÿ�λ�ȡ��ʱ��Ż���÷���ȥ��������
	 * singleton ��ʵ����(Ĭ��) ioc������������÷�����������ŵ�ioc�����У��Ժ�ÿ�λ�ȡ���Ǵ��������ã�map.get��
	 * 
	 * 
	 * ������
	 * 		��ʵ��bean��Ĭ��������������ʱ�򴴽�����
	 * 		�����أ�����������ʱ�򲻴������󣬵�һ��ʹ��(��ȡ)bean��ʱ�򴴽����󣬲���ʼ��
	 */
	@Lazy
	@Scope  
	@Bean("person")
	public Person person() {
		System.out.println("�����������һ��person");
		return new Person("����",20);
	}
	
	/**
	 * @Conditional ,����һ�������������жϣ�����������������ע��bean
	 * ���ϵͳ��windows���͸�������ע��bill
	 * ���ϵͳ��linux���͸�������ע��linus
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
	 * ��������ע�����
	 * 1����ɨ��+�����עע�⣨@Controller��@Service��@Componen..��[�Լ�д����]
	 * 2)@Bean[����ĵ���������������]
	 * 3��@Import[���ٸ������е���һ�����]
	 * 
	 */
}
