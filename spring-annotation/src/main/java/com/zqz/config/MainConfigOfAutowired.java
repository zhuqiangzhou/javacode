package com.zqz.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zqz.beans.Car;
import com.zqz.beans.Color;
import com.zqz.dao.BookDao;

/**
 * �Զ�װ�䣻
 * 		spring��������ע�루DI������ɶ�IOC�����и��������������ϵ��ֵ
 * 1��@autowired:�Զ�ע��
 * 		1��Ĭ�����Ȱ�������ȥ�������Ҷ�Ӧ�����applicationContext.getBean(..)���ҵ��͸�ֵ
 * 		2)����ҵ������ͬ���͵�������ٽ����Ե�������Ϊ�����idȥ�����в���
 * 		3)@Qualifier:ʹ�ô�ע����Ҫָ��װ������id��������ʹ��������	
 * 		4���Զ�װ��Ĭ��һ��Ҫ�����Ը���ֵ������ᱨ��
 * 		5)@Primary:��spring����װ��ģ�Ĭ��ʹ����ѡ��bean,Ҳ���Լ���ʹ��@qualifierָ����Ҫװ���bean������
 * 
 * 2��spring��֧��ʹ��@Resource(JSR250)��@Inject(JSR330)������ע����java�淶��ע��
 * 			@Resource:���Ժ�@autowiredһ��ʵ���Զ�װ�书�ܣ�Ĭ���ǰ����������װ��
 * 			��֧��@Primary���ܣ���֧��@Autowired(required=false)����
 * 			
 * 			@Inject :��Ҫ����javax inject��������@Autowired������ͬ��û��required=false����
 * 
 * 	AutowiredAnnotationBeanPostProcessor����������Զ�װ�书��
 * 
 * 3.@Autowired:�����������������������ԣ����Ǵ������л�ȡ���������ֵ
 * 		1������ע�ڷ�����
 * 		2):��ע�ڹ������ϣ�������ֻ��һ���вι�����������вι�������@autowired����ʡ�ԣ�����λ�õ�������ǿ����Զ��������л�ȡ
 * 		3�������ڲ���λ��
 * @author xg
 *
 */
@Configuration
@ComponentScan({"com.zqz.controller","com.zqz.service","com.zqz.dao","com.zqz.beans"})
public class MainConfigOfAutowired {
	
	@Primary
	@Bean("bookDao2")
	public BookDao bookDao() {
		BookDao bookDao = new BookDao();
		bookDao.setLabel("2");
		return  bookDao;
	}
	
	@Bean
	public Color color(Car car){
		Color color = new Color();
		color.setCar(car);
		return color;
	}
}
