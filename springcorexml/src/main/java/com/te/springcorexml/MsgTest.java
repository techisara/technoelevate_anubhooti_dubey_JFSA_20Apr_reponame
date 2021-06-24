package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.bean.MessageBean;

public class MsgTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("messageconfig.xml");
	  //  ((AbstractApplicationContext) context).registerShutdownHook();
//		  ConfigurableApplicationContext context2 = (ConfigurableApplicationContext) context;
//		    context2.close();
		  MessageBean m=    context.getBean("test",MessageBean.class);
		    System.out.println(m.getMsg());   
//		go with these   
		    ConfigurableApplicationContext context2 = (ConfigurableApplicationContext) context;
     	    context2.close();
		    
		    
		  //  ((AbstractApplicationContext) context).registerShutdownHook();
		
	}

}
 