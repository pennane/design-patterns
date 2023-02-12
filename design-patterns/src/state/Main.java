package state;

public class Main {

	public static void main(String[] args) {
		Protagonist villageBoy = new Protagonist();

		for (int i = 0; i < 50; i++) {
			System.out.println("Year " + i);
			System.out.println(villageBoy.getStatus());
			villageBoy.reignAndConquer();
		}

	}

}
