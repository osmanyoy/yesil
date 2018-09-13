package com.yapikredi.java.dp.behavior.template;

public abstract class AbstractMessage implements IMessage {
	protected StringBuilder sb = new StringBuilder(100);

	@Override
	public String getMessage() {
		return this.sb.toString();
	}
}
