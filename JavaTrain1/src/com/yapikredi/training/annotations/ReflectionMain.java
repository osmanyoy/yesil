package com.yapikredi.training.annotations;

import java.lang.reflect.Field;

public class ReflectionMain {
	
	public static void main(String[] args) {
		UseOfAnnotation useOfAnnotation = new UseOfAnnotation();
//		useOfAnnotation.setKey("deneme");
		System.out.println(useOfAnnotation.getKey());

		// Reflection versiyonu
		
		Class<UseOfAnnotation> class1 = UseOfAnnotation.class;
		try {
			UseOfAnnotation newInstance = class1.newInstance();
			Field[] declaredFields = class1.getDeclaredFields();
			for (Field field : declaredFields) {
				MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
				if (myAnnotation != null) {
					String propKey = myAnnotation.propKey();
					
					int test = myAnnotation.test();
					
					field.setAccessible(true);
					field.set(newInstance, propKey);
				}
			}
			System.out.println(newInstance.getKey());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
