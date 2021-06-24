package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.te.springcoreannotaions.beans.EmployeeBean;

@Configuration
@Import({DepartmentConfig.class})
public class EmployeeConfiguration {
	
	@Bean
	public EmployeeBean	 getEmployee() {
		EmployeeBean bean = new EmployeeBean();
		bean.setId(100);
		bean.setName("Yash");
//		bean.setDepartment(new Department());
		return bean;
	}
}
