package com.te.springcoreannotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotaions.beans.EmployeeBean;
import com.te.springcoreannotaions.configurations.EmployeeConfig;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		EmployeeBean employeeBean = context.getBean("one", EmployeeBean.class);
		System.out.println(employeeBean.getId()); //0
		System.out.println(employeeBean.getName());//null
		System.out.println("--------------");
		EmployeeBean employeeBean2 = context.getBean("two", EmployeeBean.class);
		System.out.println(employeeBean2.getId()); //10
		System.out.println(employeeBean2.getName()); //Lohith
		System.out.println("--------------");
		EmployeeBean employeeBean3 = context.getBean("three", EmployeeBean.class);
		System.out.println(employeeBean3.getId()); //20
		System.out.println(employeeBean3.getName()); //Mohit
	}
}
