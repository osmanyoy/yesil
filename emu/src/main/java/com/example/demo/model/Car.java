package com.example.demo.model;

import org.springframework.context.event.ApplicationEventMulticaster;

public class Car extends Vechile{

	public Car(ApplicationEventMulticaster aemParam,String name) {
		super(name,EVechileType.CAR, aemParam);
	}

}
