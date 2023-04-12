package configuration_component;


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

@Component("TestComponent")
@Scope("prototype")
public class Test_Component {
	
	
	
	

	private String name;
	public String saluta() {
		return "ciao " + name;
	}

}
