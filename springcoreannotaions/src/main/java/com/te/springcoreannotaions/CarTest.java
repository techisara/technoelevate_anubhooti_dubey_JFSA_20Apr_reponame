package com.te.springcoreannotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotaions.beans.Car;
import com.te.springcoreannotaions.configurations.CarConfig;

public class CarTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);

		Car car = context.getBean(Car.class);
		
		System.out.println(car.getEngine().getCc());
		System.out.println(car.getEngine().getTypeOfEngine());
		
		System.out.println("-----------");
		
		System.out.println(car.getWheels().getName());
		System.out.println(car.getWheels().getSize());
	}
}
