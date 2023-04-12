package com.spring_configure.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration

@PropertySource("classpath:application.properties")
public class ConfigurationTest {

	
	@Bean
	@Scope("singleton")
	public Test test() {
		return new Test("Mario Test!!!");
	}
	
	@Bean
	@Scope("prototype")
	public Test paramtest(String name) {
		return new Test(name);
	}
	
	@Bean
	@Scope("prototype")
	public Test abc() {
		return new Test("Mario Test!!!");
	}
	
	
}
