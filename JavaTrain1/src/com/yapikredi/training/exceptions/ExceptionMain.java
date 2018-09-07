package com.yapikredi.training.exceptions;

public class ExceptionMain {
	public static void main(String[] args) {
		MyClass myClass = new MyClass();

		try {
			System.out.println(myClass.helloWorld(5));
			System.out.println(myClass.helloWorld(6));
//			if (myClass != null) {
//				return;
//			}
			System.out.println(myClass.helloWorld(9));
			System.out.println(myClass.helloWorld(10));
			// Bu satýr çalýþmaz
			System.out.println(myClass.helloWorld(11));
		} catch (MyException e) {
			System.out.println("b1 : " + e.getBilgi() + " b2 : " + e.getDigerBilgi() + " b3 : " + e.getEnsonBilgi());
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Final block");
		}
	}
}
