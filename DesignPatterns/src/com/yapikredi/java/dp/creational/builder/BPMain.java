package com.yapikredi.java.dp.creational.builder;

import com.yapikredi.java.dp.creational.builder.BuilderPattern.BuilderPatternBuilder;

public class BPMain {
	public static void main(String[] args) {
		try {
			ImmutableObj immutableObj = new ImmutableObj("238476437", "osman", "yay", 48);
		} catch (Exception e) {
		}

		try {
			BuilderPattern buildPattern = BuilderPattern.getBuilder()
			                                            .withName("osman")
			                                            .withSurname("yay")
			                                            .withAge(48)
			                                            .withPhone("38932783")
			                                            .buildVersion1();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
