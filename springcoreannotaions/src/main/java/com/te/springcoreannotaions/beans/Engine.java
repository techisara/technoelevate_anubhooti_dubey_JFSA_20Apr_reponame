package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Engine implements Serializable{

	private int cc;
	
	private String typeOfEngine;
	
	public Engine() {}
}
