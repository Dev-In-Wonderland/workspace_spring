package it.eipcode.m5w1d1.configuration;





import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import piatti.GodfathersPizzas;
import topping.CustomGodfathersPizza;

@Configuration
public class ConfigurationGodfatherPizzas {
	@Bean
	public GodfathersPizzas margherita() {
		return new GodfathersPizzas();
	}
	@Bean
	@Scope("prototype")
	public GodfathersPizzas capricciosa() {
		return new GodfathersPizzas("capricciosa", "10 euro");
	}
	@Bean
	@Scope("prototype")
	public GodfathersPizzas stagioni() {
		return new GodfathersPizzas("4 stagioni","12.50 euro");
	}
	@Bean
	@Scope("prototype")
	public GodfathersPizzas frutti_di_mare() {
		return new GodfathersPizzas("frutti di mare", "14.50 euro");
	}
	@Bean
	@Scope("prototype")
	public CustomGodfathersPizza condimento(GodfathersPizzas pizza,String condimento) {
		return new CustomGodfathersPizza(pizza,condimento);
	}
	
}