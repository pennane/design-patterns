package singleton;

public enum FactorySingleton implements IFactory {
	INSTANCE;

	public Thing createThing() {
		return new Thing();
	}

	public Thong createThong() {
		return new Thong();
	}
}
