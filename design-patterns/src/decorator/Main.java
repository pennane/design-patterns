package decorator;

public class Main {

	public static void main(String[] args) {
		Pizza hawaiiPizza = new Pineapple(new Ham(new Cheese(new Tomatosauce(new SpecialPizzaCrust("Hawaii pizza")))));
		Pizza sadPizza = new Cheese(new Tomatosauce(new SpecialPizzaCrust("Margherita pizza")));
		Pizza veryGoodPizza = new Salami(
				new Onion(new Mozzarella(new Tomatosauce(new SpecialPizzaCrust("Salami pizza")))));

		PizzaMenu menu = new PizzaMenu(hawaiiPizza, sadPizza, veryGoodPizza);

		System.out.println(menu);
	}

}
