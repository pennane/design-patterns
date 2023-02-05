package composite;

public class Computer extends CompositeComponent {
	private static int PRICE = 0;

	public Computer(IComponent... children) {
		super(PRICE, children);
	}

}
