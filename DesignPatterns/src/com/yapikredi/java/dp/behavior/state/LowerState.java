package com.yapikredi.java.dp.behavior.state;

public class LowerState implements IState {

	@Override
	public void write(final String str, final StateContext context) {
		System.out.println(str.toLowerCase());
		context.setCurrent(new UpperState());

	}

}
