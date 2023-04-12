package piatti;


import lombok.ToString;


public class GodfathersPizzas extends Piatti {

	private String nutritional_info;
	private Dimensione size;
	private String condimento;
	
	public GodfathersPizzas() {
		super();
		super.setCibo("Margherita");
		super.setPrezzo("5 euro");
		this.nutritional_info ="800Kcal";
		this.size = Dimensione.Normal;
	}

	public GodfathersPizzas(String cibo, String prezzo) {
		switch(cibo) {
		case "capricciosa":
			super.setCibo(cibo);
			super.setPrezzo(prezzo);
			this.nutritional_info ="1200Kcal";
			this.size = Dimensione.Normal;
			break;
		case "4 stagioni":
			super.setCibo(cibo);
			super.setPrezzo(prezzo);
			this.nutritional_info ="1200Kcal";
			this.size = Dimensione.Normal;
			break;
		case "frutti di mare":
			super.setCibo(cibo);
			super.setPrezzo(prezzo);
			this.nutritional_info ="1350Kcal";
			this.size = Dimensione.Normal;
			break;
		}
		
	}
	
	public String getCondimento() {
		return condimento;
	}

	public void setCondimento(String condimento) {
		this.condimento = condimento;
	}

	@Override
	public String toString() {
		return "Godfather's Pizza [Cibo= " + getCibo() + ", Prezzo= " + getPrezzo() + ", Calorie= "+ this.nutritional_info +", Dimensione= "+this.size+", condimento= "+this.condimento+"]";
	}
	
	
	
}