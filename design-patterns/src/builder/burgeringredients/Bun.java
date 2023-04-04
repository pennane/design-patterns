package builder.burgeringredients;

public class Bun {
	private String name;

	public Bun(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
