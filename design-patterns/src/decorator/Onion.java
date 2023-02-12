package decorator;

public class Onion extends Topping {

	private static final int PRICE = 1;
	private static final String NAME = "red onion";

	public Onion(Pizza pizza) {
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
