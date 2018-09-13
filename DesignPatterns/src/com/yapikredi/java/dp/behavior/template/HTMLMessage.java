package com.yapikredi.java.dp.behavior.template;

public class HTMLMessage extends AbstractMessage {

	@Override
	public void header(final String str) {
		this.sb.append("<html>");
		this.sb.append("<head>");
		this.sb.append(str);
		this.sb.append("<\\head>");
		this.sb.append("\n");
	}

	@Override
	public void body(final String str) {
		this.sb.append("<body>");
		this.sb.append(str);
		this.sb.append("<\\body>");
		this.sb.append("\n");

	}

	@Override
	public void footer(final String str) {
		this.sb.append("<div>");
		this.sb.append(str);
		this.sb.append("<\\div>");
		this.sb.append("\n");
		this.sb.append("<\\html>");

	}

}
