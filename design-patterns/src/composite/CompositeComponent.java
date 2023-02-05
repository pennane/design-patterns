package composite;

import java.util.Arrays;
import java.util.List;

public abstract class CompositeComponent implements IComponent {
	private int price;
	private List<IComponent> children;

	public CompositeComponent(Integer price, IComponent... children) {
		this.price = price;
		this.children = Arrays.asList(children);
	}

	@Override
	public int getPrice() {
		return price + children.stream().map(x -> x.getPrice()).reduce(0, Integer::sum);
	}

}
