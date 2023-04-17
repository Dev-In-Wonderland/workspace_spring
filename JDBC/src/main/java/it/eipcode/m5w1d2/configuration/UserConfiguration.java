package it.eipcode.m5w1d2.configuration;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.github.javafaker.Faker;

import it.eipcode.m5w1d2.model.User;



@Configuration
@PropertySource("classpath:application.properties")
public class UserConfiguration {
	
	@Value("${user.admin.name}") String adminName;
	@Value("${user.admin.lastname}") String adminLastname;
	@Value("${user.admin.email}") String adminEmail;
	@Value("${user.admin.age}") int adminAge;
	@Value("${user.admin.city}") String adminCity;
	@Value("${user.admin.password}") String adminPassword;
	
	@Bean
	@Scope("prototype")
	public User customUser() {
		return new User();
	}
	
	@Bean
	@Scope("prototype")
	public User paramsUser() {
		return new User(adminName, adminLastname, adminEmail, adminAge, adminCity, adminPassword);
	}

	@Bean
	@Scope("prototype")
	public User fakeUser() {
		Faker fake = Faker.instance(new Locale("it-IT"));
				User u = new User();
				u.setName(fake.name().firstName());
				u.setLastname(fake.name().lastName());
				u.setAge(fake.number().numberBetween(18,80));
				u.setEmail(u.getName() + "." + u.getLastname() + "@epicode.com");
				u.setCity(fake.address().cityName());
				u.setPassword(fake.internet().password(6, 10,true, false));
		return u;
	}


	
	@Bean
	@Scope("singleton")
	public User adminUser() {
		return new User();
	}

}
