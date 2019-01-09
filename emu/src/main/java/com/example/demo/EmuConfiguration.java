package com.example.demo;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.scheduling.annotation.Scheduled;

import com.example.demo.eventman.HeartBeatEvent;

@Configuration
public class EmuConfiguration {
	

	@Scheduled(fixedRate = 5_000,initialDelay=5_000)
	public void heartBeat() {
		ApplicationEventMulticaster aem = applicationEventMulticaster();
		long index = systemCounter().increase();
		HeartBeatEvent heartBeatEvent = new HeartBeatEvent(index);
		aem.multicastEvent(heartBeatEvent);
	}

	@Bean
	public SystemCounter systemCounter() {
		return new SystemCounter();
	}
	
	@Bean
	public Executor execForMulticastEvent() {
		return Executors.newFixedThreadPool(10);
	}

	@Bean
	public ApplicationEventMulticaster applicationEventMulticaster() {
		SimpleApplicationEventMulticaster applicationEventMulticasterLoc = new SimpleApplicationEventMulticaster();
		applicationEventMulticasterLoc.setTaskExecutor(this.execForMulticastEvent());
		return applicationEventMulticasterLoc;
	}


}
