package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.bean.EmployeeBean;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		  EmployeeBean  e = context.getBean("emp",EmployeeBean.class);
		                     System.out.println(e);
		
		
	}

}
