package builder.ugly;

public class Chef {
	private IBurgerBuilder burgerBuilder;

	public IBurgerBuilder getBurgerBuilder() {
		return burgerBuilder;
	}

	public void setBurgerBuilder(IBurgerBuilder burgerBuilder) {
		this.burgerBuilder = burgerBuilder;
	}

	public void constructBurger() {
		burgerBuilder.createNewBurgerProduct();

		burgerBuilder.buildBuns();
		burgerBuilder.buildPatty();
		burgerBuilder.buildSpices();
		burgerBuilder.buildVeggies();
	}
}
