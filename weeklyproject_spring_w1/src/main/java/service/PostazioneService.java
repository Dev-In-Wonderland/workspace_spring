package service;




import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:application.properties")
public class PostazioneConfiguration {
	@Bean("CustomPostazione")
	@Scope("prototype")
	public Postazione customPostazione() {
		return new Postazione();
	}

	@Bean("ParamsPostazione")
	@Scope("prototype")
	public Postazione paramsPostazione(String descrizione, Tipo_postazione tipologia, Integer num_max, Edificio edificio, List<Prenotazione> p) {
		return new Postazione( descrizione,  tipologia,  num_max,  edificio, p);
	}


}