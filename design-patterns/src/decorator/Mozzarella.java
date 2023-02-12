package decorator;

public class Mozzarella extends Topping {

	private static final int PRICE = 2;
	private static final String NAME = "mozzarella";

	public Mozzarella(Pizza pizza) {
		super(pizza);
	}

	public int getPrice() {
		return this.pizza.getPrice() + PRICE;
	}

	public String toString() {
		if (this.pizza instanceof Topping) {
			return this.pizza.toString() + ", " + NAME;
		}

		return this.pizza.toString() + " with " + NAME;
	}

}
