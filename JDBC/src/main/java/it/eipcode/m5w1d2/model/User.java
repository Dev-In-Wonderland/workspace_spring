package it.eipcode.m5w1d2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {

	
	
	public User(String name, String lastname, String email, Integer age,String city, String password) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.city = city;
		this.password = password;
	}
	private Long id ;
	private String name;
	private String lastname;
	private String email;
	private Integer age;
	private String city;
	private String password;
	
}
