package com.te.springcoreannotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.te.springcoreannotation.bean.Department;
import com.te.springcoreannotation.bean.EmployeeBean;

@Configuration
@Import(DepartmentConfig.class)
public class EmployeeConfig {

	@Bean(name = "one")
//	@Scope(value ="request")
//	@Scope("prototype")
	public EmployeeBean	 getEmployeeBean() {
		return new EmployeeBean();
	}
	
	@Bean(name = "two")
	@Primary
	public EmployeeBean getEmpObject() {
		return new EmployeeBean(10,"ANu",new Department());
	}
	
	@Bean(name = "three")
	public EmployeeBean getEmpPropertyData() {
		EmployeeBean bean = new EmployeeBean();
		bean.setId(20);
		bean.setName("Ashi");
		return bean;
	}
}
