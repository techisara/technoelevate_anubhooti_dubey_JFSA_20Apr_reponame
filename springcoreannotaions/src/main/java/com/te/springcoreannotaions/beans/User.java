package com.te.springcoreannotaions.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User implements Serializable{
private String name;
private int age;

private Phone phone;
@Autowired
public User(String name, int age, Phone phone) {
	super();
	this.name = name;
	this.age = age;
	this.phone = phone;
}




}
