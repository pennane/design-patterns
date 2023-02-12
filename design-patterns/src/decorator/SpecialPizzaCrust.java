package decorator;

public class SpecialPizzaCrust implements Pizza {

	private static final int PRICE = 5;
	private static final String NAME = "special pizza crust";

	private String pizzaName;

	public SpecialPizzaCrust(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	@Override
	public int getPrice() {
		return PRICE;
	}

	@Override
	public String toString() {
		return pizzaName + " which consits of our " + NAME;
	}

}
