package builder.ugly;

import builder.burgeringredients.Bun;
import builder.burgeringredients.Patty;
import builder.burgeringredients.Spices;
import builder.burgeringredients.Veggies;

public class HamburgerBuilder implements IBurgerBuilder {

	private Hamburger burger;

	@Override
	public void createNewBurgerProduct() {
		burger = new Hamburger();
	}

	@Override
	public void buildBuns() {
		burger.setBuns(new Bun("SÄMBYLÄ"));
	}

	@Override
	public void buildPatty() {
		burger.setPatty(new Patty("PIHVI"));
	}

	@Override
	public void buildSpices() {
		burger.setSpices(new Spices("KETSUB JA SINAB :D"));
	}

	@Override
	public void buildVeggies() {
		burger.setVeggies(new Veggies("KURKKU :D"));
	}

	@Override
	public Object getBurger() {
		return burger;
	}

}
