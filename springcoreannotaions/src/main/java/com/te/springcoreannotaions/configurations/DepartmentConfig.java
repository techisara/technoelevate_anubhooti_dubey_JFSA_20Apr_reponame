package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotaions.beans.Department;

@Configuration
public class DepartmentConfig {

	@Bean(name = "dev")
	public Department getDept() {
		return new Department(10,"DEV"); 
	}
	
	@Bean(name = "sales")
	public Department getDeptSales() {
		return new Department(20,"Sales"); 
	}
	
	@Bean(name = "hr")
//	@Primary
	public Department getDeptHR() {
		return new Department(30,"HR"); 
	}
}
