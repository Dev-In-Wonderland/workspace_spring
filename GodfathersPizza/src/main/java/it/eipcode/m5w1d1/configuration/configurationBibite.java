package it.eipcode.m5w1d1.configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import piatti.Bibite;

@Configuration
public class configurationBibite {
	@Bean
	public Bibite RedBull() {
		return new Bibite("Red Bull", "2.50 euro");
	}
	@Bean
	@Scope("prototype")
	public Bibite Spellegrino() {
		return new Bibite("S.Pellegrino", "2 euro");
	}
	@Bean
	@Scope("prototype")
	public Bibite Fanta() {
		return new Bibite("Fanta", "2 euro");
	}
}