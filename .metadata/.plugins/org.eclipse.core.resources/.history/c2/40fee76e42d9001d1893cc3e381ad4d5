package it.eipcode.m5w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.eipcode.m5w1d1.configuration_component.Menu_Component;

@SpringBootApplication
public class GodfathersPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodfathersPizzaApplication.class, args);
		config_component();
	}
public static void config_component() {
		

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
	appContext.scan("it.eipcode.m5w1d1.configuration_component");
	appContext.refresh();
	Menu_Component t1 = (Menu_Component) appContext.getBean("MenuComponent");
	t1.setPizza("Pizza Margherita, prezzo 8 euro");
	
	System.out.println(t1.menu());
	
	Menu_Component t2 = (Menu_Component) appContext.getBean("MenuComponent");
	t2.setPizza("Pizza Napoli, prezzo 8 euro");
	
	System.out.println(t2.menu());
	
	Menu_Component t3 = (Menu_Component) appContext.getBean("MenuComponent");
	t3.setPizza("Pizza Quattro Stagioni, prezzo 10 euro");
	
	System.out.println(t3.menu());
	
	Menu_Component t4 = (Menu_Component) appContext.getBean("MenuComponent");
	t4.setPizza("Bibite: Fanta/Sprite/Red Bull, prezzo 3 euro");
	
	System.out.println(t4.menu());
			
	}
}
