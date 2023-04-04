package adapter;

public class Main {

	/**
	 * Ei varsinaisesti luokka- tai olioadapteri.
	 * 
	 * Tässä kikkailussa yhden adapterin voi tyrkätä usean adaptoitavan väliin
	 */
	public static void main(String[] args) {
		CarToToyAdapter adapteri = new CarToToyAdapter();

		ICar superAuto = new SuperCar();
		System.out.println(superAuto.describe());
		// -> auto jolla pääsee lujaa

		System.out.println(superAuto.drive());
		// -> NYT AJELLAAN LAITTOMAN TÄYSII :D

		// Adapterilla sivustakatsojan perspektiiviin
		// Iso mies leikkii autolla

		IToy leikkiAuto = adapteri.adapt(superAuto);
		System.out.println(leikkiAuto.describe());
		// -> Leluauto jolla pääsee lujaa

		System.out.println(leikkiAuto.toyWith());
		// -> NYT AJELLAAN LAITTOMAN TÄYSII :D
	}
}