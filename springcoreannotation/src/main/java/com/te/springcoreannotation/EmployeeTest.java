package com.te.springcoreannotation;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotation.bean.EmployeeBean;
import com.te.springcoreannotation.configuration.EmployeeConfig;

public class EmployeeTest {
  static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		  
//		  System.out.println("before "+e);
//		  
//		  e.setId(10);
//		  e.setName("anu");
//		  
//		  System.out.println("after "+e);
		  
		  EmployeeBean e= context.getBean(EmployeeBean.class);
 
		  System.out.println("enter employee id");
		  e.setId(Integer.parseInt(sc.nextLine()));
		  
		  System.out.println("enter employee name");
		  e.setName(sc.nextLine());
		  
		  System.out.println("employee 1 "+e );
		  
		  EmployeeBean e2= context.getBean(EmployeeBean.class);
		  
		  System.out.println("enter employee id");
		  e2.setId(Integer.parseInt(sc.nextLine()));
		  
		  System.out.println("enter employee name");
		  e2.setName(sc.nextLine());
		  
		  System.out.println("employee 2 "+e2 );
		  
		  
		  
	}
	

}
