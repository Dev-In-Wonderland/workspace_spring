package it.eipcode.m5w1d2.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	
	private String name;
	private String lastname;
	private String email;
	private String password;
	
}
