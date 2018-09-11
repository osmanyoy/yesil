package com.yapikredi.java.dp.creational.builder;

public class BuilderPattern {
	private String name;
	private String surname;
	private String phone;
	private int age;
	
	private BuilderPattern() {
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPhone() {
		return phone;
	}

	public int getAge() {
		return age;
	}
	
	public static BuilderPatternBuilder getBuilder() {
		return new BuilderPatternBuilder();
	}

	public static class BuilderPatternBuilder {
		
		BuilderPattern builderPattern = new BuilderPattern();
		
		private BuilderPatternBuilder() {
		}
		
		public BuilderPatternBuilder withName(String name) {
			builderPattern.name = name;
			return this;
		}
		
		public BuilderPatternBuilder withSurname(String surname) {
			builderPattern.surname = surname;
			return this;
		}

		public BuilderPatternBuilder withAge(int age) {
			builderPattern.age = age;
			return this;
		}

		public BuilderPatternBuilder withPhone(String phone) {
			builderPattern.phone = phone;
			return this;
		}
		
		public BuilderPattern buildVersion1() throws Exception{
			if (builderPattern.name == null) {
				throw new Exception("name boþ olamaz");
			}
			return builderPattern;
		}
		
	}
}
