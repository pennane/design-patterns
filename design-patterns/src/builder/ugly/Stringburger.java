package builder.ugly;

public class Stringburger {
	private String buns;

	private String patty;

	private String spices;

	private String veggies;

	public void setBuns(String buns) {
		this.buns = buns;
	}

	public void setPatty(String patty) {
		this.patty = patty;
	}

	public void setSpices(String spices) {
		this.spices = spices;
	}

	public void setVeggies(String veggies) {
		this.veggies = veggies;
	}

	@Override
	public String toString() {
		return "Merkkijonobögö jos on " + buns + ", " + patty + ", " + spices + ", ja " + veggies;
	}
}
