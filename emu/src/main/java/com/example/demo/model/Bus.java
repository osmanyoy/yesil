package com.example.demo.model;

import org.springframework.context.event.ApplicationEventMulticaster;

public class Bus extends Vechile{

	public Bus(ApplicationEventMulticaster aemParam,String name) {
		super(name,EVechileType.BUS, aemParam);
	}

}
