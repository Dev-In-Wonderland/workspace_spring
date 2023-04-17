package configuration;


	import java.util.List;
	import java.util.Locale;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.context.annotation.PropertySource;
	import org.springframework.context.annotation.Scope;

	

	@Configuration
	@PropertySource("classpath:application.properties")
	public class EdificioConfiguration {
		@Bean("CustomEdificio")
		@Scope("prototype")
		public Edificio customEdificio() {
			return new Edificio();
		}

		@Bean("ParamsEdificio")
		@Scope("prototype")
		public Edificio paramsEdificio(String nome, String indirizzo, String città, List<Postazione> postazione,
				List<Prenotazione> prenotazione) {
			return new Edificio(nome, indirizzo, città,  postazione,
					 prenotazione);
		}

		@Bean("FakeEdificio")
		@Scope("prototype")
		public Edificio fakeEdificio() {
			Edificio u = new Edificio();
			Faker fake = new Faker(new Locale("it-IT"));
			u.setNome(fake.space().company());
			u.setIndirizzo(fake.address().streetAddress());
			u.setCittà(fake.address().city());
		
			return u;
		}
	
	
	
}
