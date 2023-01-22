package abstractfactory;

public class AdidasFactory implements IApparelFactory {

	@Override
	public ICap createCap() {
		return new AdidasCap();
	}

	@Override
	public IShirt createShirt() {
		return new AdidasShirt();
	}

	@Override
	public ITrousers createTrousers() {
		return new AdidasTrousers();
	}

	@Override
	public IShoes createShoes() {
		return new AdidasShoes();
	}

}
