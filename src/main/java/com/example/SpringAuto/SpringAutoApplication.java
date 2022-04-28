package com.example.SpringAuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAutoApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(SpringAutoApplication.class, args);
		var car = appContext.getBean(Car.class);
		car.getCar();
	}

}
