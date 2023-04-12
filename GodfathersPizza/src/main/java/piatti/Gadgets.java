package piatti;




public class Gadgets extends Piatti {

	public Gadgets() {
		super();
	}

	public Gadgets(String cibo, String prezzo) {
		super(cibo, prezzo);
	}

	@Override
	public String toString() {
		return "Gadgets [Cibo=" + getCibo() + ",Prezzo=" + getPrezzo() + "]";
	}
	
}