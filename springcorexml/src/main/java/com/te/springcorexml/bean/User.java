package com.te.springcorexml.bean;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class User implements Serializable{
private int id;
private String name;
private Mobile mobile;
public User(){
	
}
}
