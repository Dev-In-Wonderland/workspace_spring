package it.eipcode.m5w1d1.configuration;








import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Component("MenuComponent")
@Scope("prototype")
public class Menu_Component {
	
	
	
	

	private String pizza;
	
	public String menu() {
		return "Prodotto: " + pizza;
	}

}

