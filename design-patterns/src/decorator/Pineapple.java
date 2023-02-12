package decorator;

public class Pineapple extends Topping {

	private static final int PRICE = 1;
	private static final String NAME = "pineapple";

	public Pineapple(Pizza pizza) {
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
