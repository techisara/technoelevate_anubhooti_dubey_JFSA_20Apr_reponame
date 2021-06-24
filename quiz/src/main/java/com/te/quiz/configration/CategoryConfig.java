package com.te.quiz.configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.te.quiz.beans.Category;

@Configuration
@Import(QuestionConfig.class)
public class CategoryConfig {
	@Bean
	@Scope("prototype")
 public Category getCategory() {
	 return new Category();
 }
}
