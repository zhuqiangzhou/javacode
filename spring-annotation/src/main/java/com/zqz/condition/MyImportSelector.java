package com.zqz.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector{
	
	
	//����ֵ����Ҫ���������е����ȫ����
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//�������ܷ���null
		return new String[]{"com.zqz.beans.Blue","com.zqz.beans.Yellow"};
	}

}
