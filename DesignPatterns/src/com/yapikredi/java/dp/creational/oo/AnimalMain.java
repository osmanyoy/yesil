package com.yapikredi.java.dp.creational.oo;

import java.util.Scanner;

import com.yapikredi.java.dp.creational.factory.AnimalFactory;

public class AnimalMain {
	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seçiminiz : ");
		int nextInt = scanner.nextInt();

		Animal animal = AnimalFactory.createAnimal(nextInt);

		int haraket = animal.move();
		System.out.println("Haraket : " + haraket);
		System.out.println("Voice : " + animal.speak());
		System.out.println("Eat : " + animal.eat());
		animal.uyu();
	}
}
