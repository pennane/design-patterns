package memento;

/**
 * Memento
 */
public class Memento implements IJulkinenMemento, IYksityinenMemento {
	private int arvottuLuku;

	public Memento(int arvottuLuku) {
		arvottuLuku = this.arvottuLuku;
	}

	@Override
	public int getArvottuLuku() {
		return arvottuLuku;
	}
}
