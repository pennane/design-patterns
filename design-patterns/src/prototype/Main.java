package prototype;

public class Main {

	public static void main(String[] args) {
		Clock kello1 = new Clock(new Hand(8), new Hand(0));

		kello1.printTime();
		// -> 08:00

		kello1.setMinutes(10);

		kello1.printTime();
		// -> 08:10

		Clock kello2 = kello1.clone();
		Clock kello3 = kello1.shallowClone();

		kello1.setHours(16);

		kello1.printTime();
		// -> 16:10

		kello2.printTime();
		// -> 08:10

		kello3.printTime();
		// -> 16:10
	}

}
