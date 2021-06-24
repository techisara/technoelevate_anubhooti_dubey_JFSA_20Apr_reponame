package com.te.springcorexml;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.bean.EmployeeBean;

public class EmployeeBeanTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	ApplicationContext context = new ClassPathXmlApplicationContext("employeeconfig.xml");
	  EmployeeBean e=context.getBean("emp",EmployeeBean.class);
	  System.out.println("enter the id of employee");
	  e.setId(Integer.parseInt(sc.nextLine()));
	  System.out.println("enter the name of employee");
       e.setName(sc.nextLine());
	   System.out.println(e+" "+e.hashCode());
	   
	   EmployeeBean e1=context.getBean("emp",EmployeeBean.class);
	   System.out.println("enter the id of employee");
	   e1.setId(Integer.parseInt(sc.nextLine()));
	   System.out.println("enter the name of employee");
	   e1.setName(sc.nextLine());
	   System.out.println(e1+" "+e1.hashCode());
	   
	   System.out.println(e+" "+e.hashCode());

}
}
