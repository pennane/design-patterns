package composite;

public class Motherboard extends CompositeComponent {
	private static int PRICE = 140;

	public Motherboard(IComponent... children) {
		super(PRICE, children);
	}

}
