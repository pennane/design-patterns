package singleton;

public class Main {

	public static void main(String[] args) {
		IFactory factory = FactorySingleton.INSTANCE;
		Thing thing = factory.createThing();
		Thong thong = factory.createThong();

		System.out.println("Wow, i made a " + thing + " and a " + thong);

		IFactory factory2 = FactorySingleton.INSTANCE;

		System.out.println("Factories point to same object: " + (factory == factory2));

		// this errors
		// IFactory factory3 = new FactorySingleton();
	}

}
