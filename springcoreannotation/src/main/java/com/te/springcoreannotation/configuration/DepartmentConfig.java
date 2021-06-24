package com.te.springcoreannotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotation.bean.Department;

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
