package decorator;

public class Salami extends Topping {

	private static final int PRICE = 2;
	private static final String NAME = "salami";

	public Salami(Pizza pizza) {
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
