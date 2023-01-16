package factorymethod;

public class Main {

	public static void main(String[] args) {
		AterioivaOtus opettaja = new Opettaja();
		opettaja.aterioi();
		AterioivaOtus gävlepukki = new Gävlepukki();
		gävlepukki.aterioi();
		AterioivaOtus pääsiäispupu = new Pääsiäispupu();
		pääsiäispupu.aterioi();
	}
}
