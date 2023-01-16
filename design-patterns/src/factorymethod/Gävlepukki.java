package factorymethod;

public class Gävlepukki extends AterioivaOtus {

	public Juoma createJuoma() {
		return new Julmust();
	};

}
