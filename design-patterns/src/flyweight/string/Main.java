package flyweight.string;

public class Main {

	public static void main(String[] args) {
		String fly = "fly", weight = "weight";
		String fly2 = "fly", weight2 = "weight";
		System.out.println(fly == fly2); // TRUE
		System.out.println(weight == weight2); // TRUE

		String distinctString = fly + weight;
		System.out.println(distinctString == "flyweight"); // FALSE

		String flyweight = (fly + weight).intern();
		System.out.println(flyweight == "flyweight"); // TRUE

		String ä = "ä", ö = "ö";
		String äö = "äö";

		System.out.println(ä + ö == äö); // FALSE

		String äöflyweight = (ä + ö).intern();
		System.out.println(äöflyweight == äö); // TRUE

		System.out.println("A" + "B" == "AB"); // TRUE, jännä tää yllätti
	}

}
