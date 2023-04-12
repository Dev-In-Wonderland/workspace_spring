package it.eipcode.m5w1d2.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class TestRunner implements CommandLineRunner{

	
	
	
	
	
	
	
	public static void config_Beans() {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(UserConfiguration.class);
		
		
		User u = (User) appContext.getBean ("customUser");
		u.setName("Mario");
		System.out.println(u);
		
		
		User u2 = (User) appContext.getBean ("newUser", "Francesco" , "Franciccio" );
		u2.setName("Mario");
		System.out.println(u2);

		User u3 = (User) appContext.getBean ("adminUser" );
		u3.setName("Mario");
		System.out.println(u3);

		
		
		( (AnnotationConfigApplicationContext) appContext).close();
		
		}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
		
		
}
