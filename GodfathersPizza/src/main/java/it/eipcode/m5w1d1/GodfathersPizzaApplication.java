package it.eipcode.m5w1d1;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.eipcode.m5w1d1.configuration.ConfigurationGodfatherPizzas;

import it.eipcode.m5w1d1.configuration.configurationBibite;

import piatti.Bibite;
import piatti.Gadgets;
import piatti.GodfathersPizzas;
import topping.CustomGodfathersPizza;


@SpringBootApplication
public class GodfathersPizzaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GodfathersPizzaApplication.class, args);
//		menuPizza("capricciosa");
//		menuBeverage("CocaCola");
//		aggiungiCondimento(menuPizza("capricciosa"),"fried chips");
		getMenu();
	
		
	}
	public static GodfathersPizzas menuGodfathersPizza(String cibo) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationGodfatherPizzas.class);
		GodfathersPizzas p1 = (GodfathersPizzas) appContext.getBean(cibo);
		appContext.close();
		return p1;
	}
	public static Bibite menuBibite(String cibo) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(configurationBibite.class);
		Bibite b1 = (Bibite) appContext.getBean(cibo);
		appContext.close();
		return b1;
	}
	public static CustomGodfathersPizza aggiungiCondimento(GodfathersPizzas name,String condimento) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationGodfatherPizzas.class);
		CustomGodfathersPizza b1 = (CustomGodfathersPizza) appContext.getBean("condimento",name,condimento);
		appContext.close();
		return b1;
	}
	
	public static void getMenu() {
		List<GodfathersPizzas> pizze = new ArrayList();
		pizze.add(menuGodfathersPizza("margherita"));
		pizze.add(menuGodfathersPizza("capricciosa"));
		pizze.add(menuGodfathersPizza("stagioni"));
		pizze.add(menuGodfathersPizza("frutti_di_mare"));
		List<Bibite> beverage = new ArrayList();
		beverage.add(menuBibite("RedBull"));
		beverage.add(menuBibite("Spellegrino"));
		beverage.add(menuBibite("Fanta"));
		List<Gadgets> Gadget = new ArrayList();
		Gadget.add(new Gadgets("conchiglia piccola","1.50 euro"));
		Gadget.add(new Gadgets("conchiglia grande", "10.50 euro"));
		Gadget.add(new Gadgets("conchiglia media", "5.50 euro"));
		
		System.out.println("MENU \n");
		System.out.println("Pizze:\n");
		pizze.forEach(e -> System.out.println(e.getCibo()));
		System.out.println("\nBeverage:\n");
		beverage.forEach(e -> System.out.println(e.getCibo()));
		System.out.println("\nGadget:\n");
		Gadget.forEach(e -> System.out.println(e.getCibo()));
	}

}