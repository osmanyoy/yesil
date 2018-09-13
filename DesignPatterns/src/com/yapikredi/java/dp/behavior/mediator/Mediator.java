package com.yapikredi.java.dp.behavior.mediator;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediator {
	public Map<String, IListen> map = new HashMap<>();

	public void register(final IListen listen, final String name) {
		this.map.put(name,
		             listen);
	}

	public void send(final IListen listen, final String msg) {
		Collection<IListen> values = this.map.values();
		for (IListen iListen : values) {
			if (listen != iListen) {
				iListen.listen(msg);
			}
		}
	}

	public void send(final IListen listen, final String name, final String msg) {
		IListen iListen = this.map.get(name);
		if (iListen != null) {
			iListen.listen(msg);
		}
	}

	public void send(final IListen listen, final List<String> list, final String msg) {
		for (String string : list) {
			this.send(listen,
			          string,
			          msg);
		}
	}

}
