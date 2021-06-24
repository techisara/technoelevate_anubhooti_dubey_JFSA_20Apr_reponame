package com.te.springcorexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.te.springcorexml.bean.User;

public class UserTest {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("userconfig.xml");
		
		User u = context.getBean("user", User.class);
		u.setId(10);
		u.setName("Anu");
		
		
		System.out.println(u);
		
		User u1 = context.getBean("userOne",User.class);
		System.out.println(u1);
		
		User u2 = context.getBean("userTwo",User.class);
		System.out.println(u2);
		
	}

}
