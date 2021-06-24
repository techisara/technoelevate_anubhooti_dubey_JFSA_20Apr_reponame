package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({EngineConfig.class , WheelsConfig.class})
@ComponentScan("com.te.springcoreannotaions")
public class CarConfig {

}
