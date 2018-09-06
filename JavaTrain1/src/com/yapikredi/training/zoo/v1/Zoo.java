package com.yapikredi.training.zoo.v1;

public class Zoo {
	
	public void kedi(int behavior) {
		switch (behavior) {
		case 1:
			System.out.println("Kedi mamasý");
			break;
		case 2:
			System.out.println("miyav");
			break;
		case 3:
			System.out.println("uyuyor");
			break;
		case 4:
			System.out.println("yürüyor");
			break;
		default:
			break;
		}
	}
	
	public void kopek(int behavior) {
		switch (behavior) {
		case 1:
			System.out.println("Köpek mamasý");
			break;
		case 2:
			System.out.println("Hav hav");
			break;
		case 3:
			System.out.println("uyuyor");
			break;
		case 4:
			System.out.println("yürüyor");
			break;
		default:
			break;
		}
	}

	public void aslan(int behavior) {
		switch (behavior) {
		case 1:
			System.out.println("Et");
			break;
		case 2:
			System.out.println("Kükreme");
			break;
		case 3:
			System.out.println("uyuyor");
			break;
		case 4:
			System.out.println("yürüyor");
			break;
		default:
			break;
		}
	}
	
	public void papagan(int behavior) {
		switch (behavior) {
		case 1:
			System.out.println("Yem");
			break;
		case 2:
			System.out.println("Konuþma");
			break;
		case 3:
			System.out.println("uyuyor");
			break;
		case 4:
			System.out.println("uçuyor");
			break;
		default:
			break;
		}
	}

	public void fil(int behavior) {
		switch (behavior) {
		case 1:
			System.out.println("Yaprak");
			break;
		case 2:
			System.out.println("Zzzzzz");
			break;
		case 3:
			System.out.println("uyuyor");
			break;
		case 4:
			System.out.println("yürüyor");
			break;
		default:
			break;
		}
	}

}
