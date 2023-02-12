package decorator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PizzaMenu {
	private List<Pizza> pizzas;

	public PizzaMenu(Pizza... pizzas) {
		this.pizzas = Arrays.asList(pizzas);
	}

	public static String menuItemFromPizza(Pizza pizza) {
		return pizza.toString() + "\nPrice: " + pizza.getPrice() + "€";
	}

	@Override
	public String toString() {
		return pizzas.stream().map(PizzaMenu::menuItemFromPizza).collect(Collectors.joining("\n"));
	}
}
