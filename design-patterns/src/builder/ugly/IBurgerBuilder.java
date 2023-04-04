package builder.ugly;

/**
 * Bögö
 */
public interface IBurgerBuilder {
	public void createNewBurgerProduct();

	public void buildBuns();

	public void buildPatty();

	public void buildSpices();

	public void buildVeggies();

	public Object getBurger();
}
