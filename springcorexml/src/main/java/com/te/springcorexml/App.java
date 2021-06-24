package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.bean.EmployeeBean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context1 = new ClassPathXmlApplicationContext("employeeconfig.xml");
  	  EmployeeBean e2=context1.getBean("empOne",EmployeeBean.class);
  	  System.out.println(e2.getId());
  	  System.out.println(e2.getName());
  	  System.out.println(e2.getDept().getDname());
  	  
  	  EmployeeBean e3=context1.getBean("empTwo",EmployeeBean.class);
  	  System.out.println(e3.getId());
  	  System.out.println(e3.getName());
  	  System.out.println(e3.getDept().getDname());

    }
}
