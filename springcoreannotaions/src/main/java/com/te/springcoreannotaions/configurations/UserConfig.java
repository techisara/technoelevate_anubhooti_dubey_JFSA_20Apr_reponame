package com.te.springcoreannotaions.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PhoneConfig.class)
@ComponentScan("com.te.springcoreannotaions")
public class UserConfig {

}
