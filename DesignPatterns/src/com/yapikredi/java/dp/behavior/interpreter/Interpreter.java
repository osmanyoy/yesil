package com.yapikredi.java.dp.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Interpreter {
	private Map<String, IExpression> exps = new HashMap<>();

	public Interpreter() {
		this.exps.put("dir",
		              new DirExpression());
		this.exps.put("mkdir",
		              new MakeDirExpression());
	}

	public void interpet(final String str) {
		String[] split = str.split(" ");
		String komut = split[0];
		InterpreterContext context = new InterpreterContext();
		context.setStrings(split);

		IExpression iExpression = this.exps.get(komut);
		iExpression.interpret(context);

	}

}
