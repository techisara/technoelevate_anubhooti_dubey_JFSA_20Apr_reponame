package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Wheels implements Serializable {

	private String name;
	
	private int size;
	
	public  Wheels() {
		
	}
}
