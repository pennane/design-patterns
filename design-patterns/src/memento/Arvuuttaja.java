package memento;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Originator
 */
public class Arvuuttaja {
	public static final Integer MIN_LUKU = 0;
	public static final Integer MAX_LUKU = 10;

	private Integer nykyinenLuku;

	private static int arvoLuku() {
		return ThreadLocalRandom.current().nextInt(MIN_LUKU, MAX_LUKU + 1);
	}

	public void liityPeliin(Pelaaja pelaaja) {
		pelaaja.setMemento(new Memento(arvoLuku()));
	}

	synchronized public Integer arvaa(IJulkinenMemento julkinenMemento, Integer arvaus) {
		IYksityinenMemento memento = (IYksityinenMemento) julkinenMemento;
		nykyinenLuku = memento.getArvottuLuku();

		return nykyinenLuku.compareTo(arvaus);
	}
}
