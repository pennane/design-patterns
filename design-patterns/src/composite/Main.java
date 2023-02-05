package composite;

public class Main {
	public static void main(String[] args) {
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
