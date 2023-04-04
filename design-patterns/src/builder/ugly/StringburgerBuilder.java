package builder.ugly;

public class StringburgerBuilder implements IBurgerBuilder {
	private Stringburger burger;

	@Override
	public void createNewBurgerProduct() {
		burger = new Stringburger();
	}

	@Override
	public void buildBuns() {
		burger.setBuns("sämbyl");
	}

	@Override
	public void buildPatty() {
		burger.setPatty("bihvi");
	}

	@Override
	public void buildSpices() {
		burger.setSpices("ketsub");
	}

	@Override
	public void buildVeggies() {
		burger.setVeggies("salad");

	}

	@Override
	public Stringburger getBurger() {
		return burger;
	}

}
