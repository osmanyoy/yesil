package com.yapikredi.training.zoo.v3;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ZooMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Kedi");
		System.out.println("2-Kopek");
		System.out.println("3-Aslan");
		System.out.println("4-Papaðan");
		System.out.println("5-Fil");
		System.out.println("Seçiminiz : ");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			Kedi kedi = new Kedi();
			kedi.konus();
			kedi.uyu();
			kedi.yuru();
			kedi.yemek();
			break;

		case 2:
			Kopek kopek = new Kopek();
			kopek.konus();
			kopek.uyu();
			kopek.yuru();
			kopek.yemek();
			break;

		case 3:
			Aslan aslan = new Aslan();
			aslan.konus();
			aslan.uyu();
			aslan.yuru();
			aslan.yemek();
			break;

		case 4:
			Papagan papagan = new Papagan();
			papagan.konus();
			papagan.uyu();
			papagan.yuru();
			papagan.yemek();
			break;

		case 5:
			Fil fil = new Fil();
			fil.konus();
			fil.uyu();
			fil.yuru();
			fil.yemek();
			break;
		default:
			break;
		}
	}
}
