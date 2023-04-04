package builder.ugly;

public class Main {

	public static void main(String[] args) {
		Chef kokki = new Chef();

		/**
		 * Tsydeemi missä on director ja erilaisia buildereita
		 */

		IBurgerBuilder stringburgerBuilder = new StringburgerBuilder();
		IBurgerBuilder hamburgerBuilder = new HamburgerBuilder();

		kokki.setBurgerBuilder(stringburgerBuilder);
		kokki.constructBurger();
		System.out.println(kokki.getBurgerBuilder().getBurger());
		// Merkkijonobögö jos on sämbyl, bihvi, ketsub, ja salad

		kokki.setBurgerBuilder(hamburgerBuilder);
		kokki.constructBurger();
		System.out.println(kokki.getBurgerBuilder().getBurger());
		// Oikee bögö jos on SÄMBYLÄ, PIHVI, KETSUB JA SINAB :D, ja KURKKU :D
	}

}
