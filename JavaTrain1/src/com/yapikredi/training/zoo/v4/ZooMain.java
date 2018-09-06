package com.yapikredi.training.zoo.v4;

import java.util.Scanner;

public class ZooMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ZooManager zooManager = new ZooManager();
		zooManager.printMenu();
		System.out.println("Seçiminiz : ");
		int nextInt = scanner.nextInt();
		Hayvan hayvan = zooManager.getHayvan(nextInt);
		hayvan.konus();
		hayvan.yuru();
		hayvan.uyu();
		hayvan.yemek();
		
	}
}
