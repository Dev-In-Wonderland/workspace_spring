package it.eipcode.m5w1d2;

import org.junit.jupiter.api.Test;
import org.springframework.test.context.event.annotation.AfterTestClass;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

import it.eipcode.m5w1d2.test.User;

public class UserTest {
	User u;
	
	
	
	
	@BeforeAll
	public static void beforeClassTest() {
		 
		 System.out.println("beforeClassTest");
	}
	
	
	
	
	@BeforeEach
	public void beforeTest() {
		 u = new User("Arminoio","Delloccio","nm@mn.it","qwerty" );
		 System.out.println("beforeTest");
	}
	
	
	@Test
	public void testPassword()
	{
		User u = new User("Arminoio","Delloccio","nm@mn.it","qwerty" );
		//assertEquals("qwerty", u.getPassword());
		assertTrue("", u.getPassword());
	}

	
	
	@Test
	@Disabled
	public void testMail()
	{
		User u = new User("Arminoio","Delloccio","nm@mn.it","qwerty" );
		assertEquals("nm@mn.it", u.getEmail());
	}

	
	@AfterEach
	public void afterTest() {
		 u = null;
		 System.out.println("afterTest");
	}
	
	
	
	@AfterAll
	public static void afterClassTest() {
		 
		 System.out.println("afterClassTest");
	}

}
