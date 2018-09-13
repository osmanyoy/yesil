package com.yapikredi.java.dp.behavior.template;

public class TemplateMain {
	public static void main(final String[] args) {
		IMessage message = new HTMLMessage();
		message.header("test header");
		message.body("test body");
		message.footer("test footer");

		System.out.println(message.getMessage());

	}
}
