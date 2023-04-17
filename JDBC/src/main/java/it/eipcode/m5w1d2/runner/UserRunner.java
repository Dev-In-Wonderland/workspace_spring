package it.eipcode.m5w1d2.runner;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;





@Component
public class UserRunner implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		createUserRunner();
	}
	
	public void createUserRunner() {
ApplicationContext appContext = new AnnotationConfigApplicationContext();
		
		
		User u1 = (User) appContext.getBean ("fakeUser");
		
		System.out.println(u1);
		
		
		

		
		
		( (AnnotationConfigApplicationContext) appContext).close();
		
		}
	
	
	
	}


