package com.yapikredi.training.zoo.v1;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ZooMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Zoo zoo = new Zoo();
		System.out.println("1-Kedi");
		System.out.println("2-Kopek");
		System.out.println("3-Aslan");
		System.out.println("4-Papaðan");
		System.out.println("5-Fil");
		System.out.println("Seçiminiz : ");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			zoo.kedi(1);
			zoo.kedi(2);
			zoo.kedi(3);
			zoo.kedi(4);
			break;

		case 2:
			zoo.kopek(1);
			zoo.kopek(2);
			zoo.kopek(3);
			zoo.kopek(4);
			break;

		case 3:
			zoo.aslan(1);
			zoo.aslan(2);
			zoo.aslan(3);
			zoo.aslan(4);
			break;

		case 4:
			zoo.papagan(1);
			zoo.papagan(2);
			zoo.papagan(3);
			zoo.papagan(4);
			break;

		case 5:
			zoo.fil(1);
			zoo.fil(2);
			zoo.fil(3);
			zoo.fil(4);
			break;

		default:
			break;
		}
	}
}
