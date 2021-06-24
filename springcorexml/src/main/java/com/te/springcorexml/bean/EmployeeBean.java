package com.te.springcorexml.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeBean implements Serializable {
private int id;
private String name;
private Department dept;
public EmployeeBean() {
	super();
	// TODO Auto-generated constructor stub
}



}
