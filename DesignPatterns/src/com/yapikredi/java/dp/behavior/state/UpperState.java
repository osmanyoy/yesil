package com.yapikredi.java.dp.behavior.state;

public class UpperState implements IState {

	@Override
	public void write(final String str, final StateContext context) {
		System.out.println(str.toUpperCase());
		context.setCurrent(new LowerState());

	}

}
