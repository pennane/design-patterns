package builder.nice;

public class BurgerBuilder {
	private String buns;

	private String patty;

	private String spices;

	private String veggies;

	public String name;

	public BurgerBuilder setBuns(String buns) {
		this.buns = buns;
		return this;
	};

	public BurgerBuilder setPatty(String patty) {
		this.patty = patty;
		return this;
	};

	public BurgerBuilder setSpices(String spices) {
		this.spices = spices;
		return this;
	};

	public BurgerBuilder setVeggies(String veggies) {
		this.veggies = veggies;
		return this;
	};

	public BurgerBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public Burger construct() {
		Burger burger = new Burger();
		burger.setBuns(buns);
		burger.setPatty(patty);
		burger.setSpices(spices);
		burger.setVeggies(veggies);
		burger.setName(name);
		return burger;
	};
}
