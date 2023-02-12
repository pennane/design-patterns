package decorator;

public abstract class Topping implements Pizza {
	protected Pizza pizza;

	public Topping(Pizza pizza) {
		this.pizza = pizza;
	}

	public int getPrice() {
		return this.pizza.getPrice();
	}

	public String toString() {
		return this.pizza.toString();
	}

}
