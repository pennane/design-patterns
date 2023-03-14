package memento;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Caretaker
 */
public class Pelaaja extends Thread {
	private String nimi;
	private Arvuuttaja arvuuttaja;
	private IJulkinenMemento memento;

	private Integer arvaus;
	private Integer vastaus;

	public Pelaaja(String nimi, Arvuuttaja arvuuttaja) {
		this.arvuuttaja = arvuuttaja;
		this.nimi = nimi;

		arvuuttaja.liityPeliin(this);

		this.arvaus = null;
		this.vastaus = null;
	}

	public void setMemento(IJulkinenMemento memento) {
		this.memento = memento;
	}

	@Override
	public void run() {
		while (true) {
			try {
				sleep(ThreadLocalRandom.current().nextInt(500, 1000));

				if (arvaus == null || vastaus == null) {
					arvaus = ThreadLocalRandom.current().nextInt(Arvuuttaja.MIN_LUKU, Arvuuttaja.MAX_LUKU + 1);
				} else if (vastaus > 0) {
					System.out.println(this + " arvasi liian vähän");
					arvaus = ThreadLocalRandom.current().nextInt(arvaus + 1, Arvuuttaja.MAX_LUKU + 1);
				} else if (vastaus < 0) {
					System.out.println(this + " arvasi liian vähän");
					arvaus = ThreadLocalRandom.current().nextInt(Arvuuttaja.MIN_LUKU, arvaus + 1);
				} else {
					System.out.println(this + " arvasi oikein! JEE :D");
					break;
				}

				System.out.println(this + " arvaa " + arvaus);
				vastaus = arvuuttaja.arvaa(memento, arvaus);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		return nimi;
	}

}
