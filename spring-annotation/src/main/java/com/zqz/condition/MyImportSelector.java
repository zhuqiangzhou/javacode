package com.zqz.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector{
	
	
	//返回值就是要导入容器中的组件全类名
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		//方法不能返回null
		return new String[]{"com.zqz.beans.Blue","com.zqz.beans.Yellow"};
	}

}
