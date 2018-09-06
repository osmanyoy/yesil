package com.yapikredi.training.loops;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seçiminiz : ");
		int nextInt = scanner.nextInt();

		switch (nextInt) {
		case 1:
			System.out.println("1 seçildi");
			break;
		case 2:
			System.out.println("2 seçildi");
			break;
		case 3:
			System.out.println("3 seçildi");
			break;
		case 4:
			System.out.println("4 seçildi");
			break;
		case 5:
			System.out.println("5 seçildi");
			break;

		default:
			System.out.println("Yalnýþ seçildi");
			break;
		}
		
		if (nextInt > 5) {
			System.err.println("Error 5 den büyük");
		} else if (nextInt == 5) {
			System.out.println("5 seçildi");
		} else if (nextInt == 4) {
			System.out.println("4 seçildi");
		} else if (nextInt == 3) {
			System.out.println("3 seçildi");
		} else if (nextInt == 2) {
			System.out.println("2 seçildi");
		} else if (nextInt == 1) {
			System.out.println("1 seçildi");
		}
		
	}
}
