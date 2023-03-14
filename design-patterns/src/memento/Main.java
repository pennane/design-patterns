package memento;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static int PELAAJIEN_MÄÄRÄ = 4;

	public static void main(String[] args) throws InterruptedException {
		Arvuuttaja arvuuttaja = new Arvuuttaja();

		List<Pelaaja> pelaajat = new ArrayList<>();

		for (int i = 0; i < PELAAJIEN_MÄÄRÄ; i++) {
			Pelaaja pelaaja = new Pelaaja("Pelaaja " + i, arvuuttaja);
			pelaajat.add(pelaaja);
			pelaaja.start();
		}

		for (Pelaaja pelaaja : pelaajat) {
			pelaaja.join();
		}

		System.out.println("VALMISTA :D");

	}

}
