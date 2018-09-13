package com.yapikredi.java.dp.behavior.template;

public class XMLMessage extends AbstractMessage {

	@Override
	public void header(final String str) {
		this.sb.append("<header>");
		this.sb.append(str);
		this.sb.append("<\\header>");
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
		this.sb.append("<footer>");
		this.sb.append(str);
		this.sb.append("<\\footer>");
		this.sb.append("\n");

	}

}
