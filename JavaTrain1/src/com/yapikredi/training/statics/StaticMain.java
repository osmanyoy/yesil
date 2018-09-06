package com.yapikredi.training.statics;

public class StaticMain {
	
	private static int b;
	
	private int c;
	
	public static String testMethod(int a) {
		return "Deðer " + a + " " + b;
	}

	public static void main(String[] args) {
		String string = "soaaos";
		
		if (StringUtils.isStringNotEmpty(string)) {
			
		}
		
		if (string != null && !string.isEmpty()) {
			
		}
		
		System.out.println("Test Method : " + StaticMain.testMethod(100));
		
		
		StaticMain staticMain1 = new StaticMain();
		staticMain1.c = 100;
		StaticMain.b = 200;
		StaticMain staticMain2 = new StaticMain();
		staticMain2.c = 101;
		StaticMain.b = 201;
		StaticMain staticMain3 = new StaticMain();
		staticMain3.c = 102;
		StaticMain.b = 202;
		
		System.out.println(staticMain1.b);
		System.out.println(staticMain2.b);
		System.out.println(staticMain3.b);
		
		System.out.println(staticMain1.c);
		System.out.println(staticMain2.c);
		System.out.println(staticMain3.c);

	}
	
	
}
