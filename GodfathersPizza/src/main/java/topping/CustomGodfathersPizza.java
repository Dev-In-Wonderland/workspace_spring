package topping;




import piatti.GodfathersPizzas;

public class CustomGodfathersPizza {
	private GodfathersPizzas pizza;

	public CustomGodfathersPizza(GodfathersPizzas pizza,String condimento) {
		switch(condimento){
		case "fried chips":
			this.pizza = pizza;
			this.pizza.setPrezzo(this.pizza.getPrezzo()+ "+ 1 euro");
			this.pizza.setCondimento(condimento);
			break;
		
		case "salsa barbecue":
			this.pizza = pizza;
			this.pizza.setPrezzo(this.pizza.getPrezzo()+"+ 20 centesimi");
			this.pizza.setCondimento(condimento);
			break;
		
		case "salsa dello chef":
			this.pizza = pizza;
			this.pizza.setPrezzo(this.pizza.getPrezzo()+"+ 50 centesimi");
			this.pizza.setCondimento(condimento);
			break;
		}
		
	}

	@Override
	public String toString() {
		return "CustomGodfathersPizza [pizza=" + pizza + "]";
	}}


	
	
	
	