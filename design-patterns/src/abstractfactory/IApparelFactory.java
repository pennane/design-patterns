package abstractfactory;

public interface IApparelFactory {
	public ICap createCap();
	public IShirt createShirt();
	public ITrousers createTrousers();
	public IShoes createShoes();
}
