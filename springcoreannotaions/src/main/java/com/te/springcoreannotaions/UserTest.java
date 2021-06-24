package com.te.springcoreannotaions;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotaions.beans.User;
import com.te.springcoreannotaions.configurations.UserConfig;

public class UserTest {
   public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
	
	User user = context.getBean(User.class);
	System.out.println(user);
	
}
}
