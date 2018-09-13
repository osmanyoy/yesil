package com.yapikredi.java.dp.behavior.state;

public class StateContext implements IState {
	private IState current = new UpperState();

	public IState getCurrent() {
		return this.current;
	}

	public void setCurrent(final IState current) {
		this.current = current;
	}

	@Override
	public void write(final String str, final StateContext context) {
		this.current.write(str,
		                   context);
	}
}
