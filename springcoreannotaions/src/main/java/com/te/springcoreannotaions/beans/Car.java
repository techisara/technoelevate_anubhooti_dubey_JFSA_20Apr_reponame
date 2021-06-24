package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Car implements Serializable {

	private Engine engine;

	private Wheels wheels;
	
	@Autowired
	public Car(Engine engine, @Qualifier("ceat") Wheels wheels) {
		super();
		this.engine = engine;
		this.wheels = wheels;
	}
}
