package composite;

public class Main {
	public static void main(String[] args) {
		/**
		 * Decided against adding add and remove methods to the game as I could not find
		 * a clean way to support them.
		 * 
		 * (i.e. I did not want to do any typecasting or adding redundant methods to the
		 * leaf classes)
		 * 
		 * This solution is clean in the sense that there are no methods :D Just using
		 * the constructors to create IMMUTABLE datastructures.
		 */

		IComponent prosessori = new Cpu();
		IComponent näytönohjain = new Gpu();
		IComponent ramMuisti = new Ram();
		IComponent ssd = new Ssd();
		IComponent poweri = new Psu();
		IComponent ärGeeBeeLedit = new RgbLedThing();

		IComponent emolevy = new Motherboard(prosessori, näytönohjain, ramMuisti, ssd, poweri);

		IComponent kotelo = new Case(emolevy, ärGeeBeeLedit);

		IComponent tietokone = new Computer(kotelo);

		System.out.println(tietokone.getPrice());
	}
}
