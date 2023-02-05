package composite;

public abstract class LeafComponent implements IComponent {
	private int price;
	
	public LeafComponent(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return this.price;
	}
	
}
