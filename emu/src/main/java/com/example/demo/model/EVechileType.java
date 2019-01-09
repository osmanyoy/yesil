package com.example.demo.model;

public enum EVechileType {
	
	CAR(4,0.1F),BUS(10,0.5F),TRUCK(16,0.7F);
	
	private EVechileType(float tankSize,float avarageConsumption) {
		this.tankSize = tankSize;
		this.avarageConsumption = avarageConsumption;
	}
	
	private float tankSize;
	private float avarageConsumption;

	public float getTankSize() {
		return tankSize;
	}
	public float getAvarageConsumption() {
		return avarageConsumption;
	}
	
	
}
