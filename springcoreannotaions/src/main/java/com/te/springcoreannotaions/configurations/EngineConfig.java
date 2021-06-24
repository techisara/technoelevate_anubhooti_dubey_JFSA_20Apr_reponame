package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotaions.beans.Engine;

@Configuration
public class EngineConfig {

	@Bean
	public Engine getEngine() {
		return new Engine(8000, "V8");
	}
}
