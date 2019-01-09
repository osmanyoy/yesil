package com.example.demo.eventman;

import org.springframework.context.ApplicationEvent;

public class HeartBeatEvent extends ApplicationEvent{

	private static final long serialVersionUID = 7247090316571252006L;
	
	private long index;
	
	public HeartBeatEvent(long indexParam) {
		super(HeartBeatEvent.class);
		index = indexParam;
	}

	public long getIndex() {
		return index;
	}

}
