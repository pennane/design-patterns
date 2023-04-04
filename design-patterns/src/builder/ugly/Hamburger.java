package builder.ugly;

import builder.burgeringredients.Bun;
import builder.burgeringredients.Patty;
import builder.burgeringredients.Spices;
import builder.burgeringredients.Veggies;

public class Hamburger {
	private Bun buns;

	private Patty patty;

	private Spices spices;

	private Veggies veggies;

	public void setBuns(Bun buns) {
		this.buns = buns;
	}

	public void setPatty(Patty patty) {
		this.patty = patty;
	}

	public void setSpices(Spices spices) {
		this.spices = spices;
	}

	public void setVeggies(Veggies veggies) {
		this.veggies = veggies;
	}

	@Override
	public String toString() {
		return "Oikee bögö jos on " + buns + ", " + patty + ", " + spices + ", ja " + veggies;
	}
}
