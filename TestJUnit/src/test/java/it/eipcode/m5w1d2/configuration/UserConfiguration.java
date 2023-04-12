package it.eipcode.m5w1d2.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import it.eipcode.m5w1d2.test.User;

@Configuration
public class UserConfiguration {

	@Value("${user.admin.name}") private String adminName;
	@Value("${user.admin.lastname}")private String  adminLastname; 
	@Value("${user.admin.email}")private String adminEmail;
	@Value("${user.admin.password}")private String adminPassword;
	
	
	
	
	
	@Bean
	@Scope("prototype")
	public User customUser() {
		return new User();
	} 
	
	
	@Bean
	@Scope("prototype")
	public User newUser(String name, String lastname, String email, String password) {
		return new User(name, lastname, email, password);
	} 
	
	@Bean
	@Scope("singleton")
	public User adminUser() {
		return new User(adminName, adminLastname, adminEmail, adminPassword );
	} 
	
}
