package com.zqz.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.zqz.beans.Rainbow;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{
	
	/**
	 * AnnotationMetadata 当前类的注解信息
	 * BeanDefinitionRegistry:把所有添加到容器中的bean
	 * 调用registerBeanDefinition手动注册
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		boolean containsBeanDefinition = registry.containsBeanDefinition("com.zqz.beans.Red");
		boolean containsBeanDefinition2 = registry.containsBeanDefinition("com.zqz.beans.Blue");
		if (containsBeanDefinition && containsBeanDefinition2) {
			//指定bean名
			RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Rainbow.class);
			registry.registerBeanDefinition("rainBow", rootBeanDefinition);
		}
	}

}
