package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Department implements Serializable{
	
	private int did;
	
	private String dname;
	
	public Department() {}
}
