package com.yapikredi.training.annotations;

public class UseOfAnnotation {
	
	@MyAnnotation(propKey="test",test=1000)
	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
}
