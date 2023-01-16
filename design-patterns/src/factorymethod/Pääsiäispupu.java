package factorymethod;

public class Pääsiäispupu extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Påskmust();
	};

}
