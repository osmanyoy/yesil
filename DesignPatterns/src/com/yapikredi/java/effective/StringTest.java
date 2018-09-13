package com.yapikredi.java.effective;

public class StringTest {
	public static void main(final String[] args) {
		long delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			String string = "osman" + i + "mehmet" + (i * 2) + "ali";
			string += "tool" + i;
			string += "tool2" + i;
		}
		delta = System.currentTimeMillis() - delta;
		System.out.println("Concat : " + delta);

		delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			StringBuilder stringBuilder = new StringBuilder(100);
			stringBuilder.append("osman");
			stringBuilder.append(i);
			stringBuilder.append("mehmet");
			stringBuilder.append(i * 2);
			stringBuilder.append("ali");
			stringBuilder.append("tool");
			stringBuilder.append(i);
			stringBuilder.append("tool2");
			stringBuilder.append(i);
			String str = stringBuilder.toString();
		}
		delta = System.currentTimeMillis() - delta;
		System.out.println("String builder : " + delta);

		delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			String string = String.format("osman %dmehmet%dalitool%dtool2%d",
			                              i,
			                              i * 2,
			                              i,
			                              i);
		}
		delta = System.currentTimeMillis() - delta;
		System.out.println("Format : " + delta);
	}
}
