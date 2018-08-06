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

//������==�����ļ�
@Configuration   //����spring����һ��������
@ComponentScans(
		@ComponentScan(value="com.zqz",includeFilters = {
//				@Filter(type=FilterType.ANNOTATION,classes={Controller.class})},useDefaultFilters=false)	
				@Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})},useDefaultFilters=false)
		)
//@ComponentScan value:ָ��Ҫɨ��İ�
//excludeFilters = Filter[]   ָ��ɨ���ʱ����ʲô�����ų���Щ���
//includeFilters = Filter[]   ָ��ɨ���ʱ��ֻ��Ҫ������Щ���   �������includeFilters��Ч��������useDefaultFilters=true
//FilterType.annotation:����ע��
//FilterType.ASSIGNABLE_TYPE:���ո�������
//FilterType.ASPECTJ:����aspectJ���ʽ
//FilterType.REGEX:ʹ��������ʽ
//FilterType.CUSTOM:
public class MainConfig {
	
	@Bean("person") //��������ע��һ��Bean,����Ϊ����ֵ������,idĬ�����÷�������Ϊid
	public Person person04() {
		return new Person("lisi",10);
	}
}
