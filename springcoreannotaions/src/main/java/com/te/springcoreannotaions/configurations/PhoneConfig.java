package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotaions.beans.Phone;

@Configuration
public class PhoneConfig {
     @Bean
	public Phone getPhone() {
		return new Phone("+1",101);
	}

}
