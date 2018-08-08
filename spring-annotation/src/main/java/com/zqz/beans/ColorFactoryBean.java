package com.zqz.beans;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean<Color>{
	
	//返回一个Color对象，这个对象会添加到容器中
	@Override
	public Color getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Color();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Color.class;
	}
	
	//是否为单例
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
