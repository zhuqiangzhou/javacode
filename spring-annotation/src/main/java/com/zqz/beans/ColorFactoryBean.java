package com.zqz.beans;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean<Color>{
	
	//����һ��Color��������������ӵ�������
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
	
	//�Ƿ�Ϊ����
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
