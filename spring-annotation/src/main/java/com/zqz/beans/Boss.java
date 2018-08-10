package com.zqz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Ĭ�ϼ���ioc�����е��������������������޲ι�������������ڽ��г�ʼ����ֵ����
@Component
public class Boss {
	
	private Car car;
	
	//��������Ҫ�õ���������Ǵ������л�ȡ
	@Autowired
	public Boss(Car car) {
		this.car = car;
		System.out.println("boss..�вι�����");
	}
	
	public Car getCar() {
		return car;
	}
	
	//@Autowired
	//��ע�ڷ�����spring����������ǰ���󣬾ͻ���÷�������ɸ�ֵ
	//����ʹ�õĲ������Զ������͵�ֵ��ioc�����л�ȡ
	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Boss [car=" + car + "]";
	}
	
	
}
