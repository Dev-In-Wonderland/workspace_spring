package piatti;




public class Bibite extends Piatti{
	private String nutritional_info;
	private Dimensione size;
	public Bibite(String cibo, String prezzo) {
		switch(cibo) {
		case "Red Bull":
			super.setCibo(cibo);
			super.setPrezzo(prezzo);
			this.nutritional_info ="157Kcal";
			this.size = Dimensione.Normal;
			break;
		case "S.Pellegrino":
			super.setCibo(cibo);
			super.setPrezzo(prezzo);
			this.nutritional_info ="13Kcal";
			this.size = Dimensione.Normal;
			break;
		case "Fanta":
			super.setCibo(cibo);
			super.setPrezzo(prezzo);
			this.nutritional_info ="98Kcal";
			this.size = Dimensione.Normal;
			break;
		}
		
	}
	@Override
	public String toString() {
		return "Bibite [Cibo= " + getCibo() + ", Prezzo= " + getPrezzo() + ", Calorie= "+ this.nutritional_info +", Dimensione= "+this.size+"]";
	}
}