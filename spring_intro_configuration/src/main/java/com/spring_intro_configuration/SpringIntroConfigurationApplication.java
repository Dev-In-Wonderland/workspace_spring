package com.spring_intro_configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.aot.ApplicationContextAotGenerator;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_configure.configuration.ConfigurationTest;
import com.spring_configure.configuration.Test;

import configuration_component.Test_Component;

@SpringBootApplication
public class SpringIntroConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntroConfigurationApplication.class, args);
		
		
		
//		congfig_Beans();
		
		//config_xml();
		
		
		config_component();
		//Configurazione 1
		
		
		
	}
	
	public static void config_Beans() {
	ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationTest.class);
	
	
	Test t1 = (Test) appContext.getBean ("test");
	
	System.out.println(t1.saluta());

	
	
	
	Test t2 = (Test) appContext.getBean ("paramtest", "Param Test");
	
	System.out.println(t2.saluta());
	
	
	( (AnnotationConfigApplicationContext) appContext).close();
	
	}
	
	
	
	
	
	public static void config_xml() {

	
	 ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("Beans.xml");
	 
	 Test t1 = (Test) appContext.getBean ("testxml");
	 System.out.println(t1.saluta());
	 appContext.close();
	 
	 
	 
	}
	
	public static void config_component() {
		

		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
	appContext.scan("configuration_component");
	appContext.refresh();
	Test_Component t1 = (Test_Component) appContext.getBean("TestComponent");
	t1.setName("TestComponent");
	System.out.println(t1.saluta());
			
	}
}
