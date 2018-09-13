package com.yapikredi.java.dp.behavior.template;

public class TextMessage extends AbstractMessage {

	@Override
	public void header(final String str) {
		this.sb.append(str);
		this.sb.append("\n");
	}

	@Override
	public void body(final String str) {
		this.sb.append(str);
		this.sb.append("\n");

	}

	@Override
	public void footer(final String str) {
		this.sb.append(str);
		this.sb.append("\n");

	}

}
