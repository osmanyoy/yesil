package com.example.demo.model;

import org.springframework.context.event.ApplicationEventMulticaster;

public class Truck extends Vechile{

	public Truck(ApplicationEventMulticaster aemParam,String name) {
		super(name,EVechileType.TRUCK, aemParam);
	}

}
