package configuration_xml;


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


public class TestXml {
	
	
	
	

	private String name;
	public String saluta() {
		return "ciao " + name;
	}

}
