package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.example.demo.model.Bus;
import com.example.demo.model.Car;
import com.example.demo.model.Truck;

@SpringBootApplication
@EnableScheduling
public class EmuApplication implements ApplicationRunner{
	
	@Autowired
	private ApplicationEventMulticaster aem;

	public static void main(String[] args) {
		SpringApplication.run(EmuApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		new Car(aem,"car1");
		new Bus(aem,"bus1");
		new Truck(aem,"truck1");

	}

}

