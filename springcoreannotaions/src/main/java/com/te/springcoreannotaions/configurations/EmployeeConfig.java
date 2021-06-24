package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotaions.beans.Department;
import com.te.springcoreannotaions.beans.EmployeeBean;



@Configuration
public class EmployeeConfig {

	@Bean(name = "one")
//	@Scope(value ="request")
//	@Scope("prototype")
	public EmployeeBean	 getEmployeeBean() {
		return new EmployeeBean();
	}
//	<bean id=".." class=".."> </bean>
	
	@Bean(name = "two")
	@Primary
	public EmployeeBean getEmpObject() {
		return new EmployeeBean(10,"Lohith" ,new Department());
	}
//	<bean id=".." class=".."> <constructor-arg> </bean>
	
	@Bean(name = "three")
	public EmployeeBean getEmpPropertyData() {
		EmployeeBean bean = new EmployeeBean();
		bean.setId(20);
		bean.setName("Mohit");
		return bean;
	}
//	<bean id=".." class=".."> <property> </bean>	
}
