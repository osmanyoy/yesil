package com.yapikredi.training.zoo.v4;

public class ZooManager {
	private Hayvan[] hayvans = new Hayvan[6];
	
	public ZooManager() {
		hayvans[0] = new Kedi();
		hayvans[1] = new Kopek();
		hayvans[2] = new Aslan();
		hayvans[3] = new Papagan();
		hayvans[4] = new Fil();
		hayvans[5] = new Zebra();
	}
	
	public void printMenu() {
		for (int i = 0; i < hayvans.length; i++) {
			System.out.println((i+1) +"-" + hayvans[i].getName());
		}
	}
	
	public Hayvan getHayvan(int index) {
		return hayvans[index - 1];
	}
	
}
