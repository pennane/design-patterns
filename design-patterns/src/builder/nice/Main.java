package builder.nice;

public class Main {

	public static void main(String[] args) {
		BurgerBuilder burgerBuilder = new BurgerBuilder()
				.setName("Perus bursa")
				.setBuns("hyvä sämbylä")
				.setPatty("veke pihvi")
				.setSpices("ketsuppi ja talon kastike")
				.setVeggies("salde ja tomaatti");
			
		Burger bökö1 = burgerBuilder.construct();
		Burger bökö2 = burgerBuilder.construct();
		
		burgerBuilder.setName("Mukautettu bursa");
		burgerBuilder.setPatty("KOKOLIHAPIHVI :D");
		
		Burger bökö3 = burgerBuilder.construct();
		
		System.out.println(bökö1);
		// Perus bursa jossa on hyvä sämbylä, veke pihvi, ketsuppi ja talon kastike, ja salde ja tomaatti
		System.out.println(bökö2);
		// Perus bursa jossa on hyvä sämbylä, veke pihvi, ketsuppi ja talon kastike, ja salde ja tomaatti
		System.out.println(bökö3);
		// Mukautettu bursa jossa on hyvä sämbylä, KOKOLIHAPIHVI :D, ketsuppi ja talon kastike, ja salde ja tomaatti

	}

}
