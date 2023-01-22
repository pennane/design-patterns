package abstractfactory;

public class BossFactory implements IApparelFactory {

	@Override
	public ICap createCap() {
		return new BossCap();
	}

	@Override
	public IShirt createShirt() {
		return new BossShirt();
	}

	@Override
	public ITrousers createTrousers() {
		return new BossTrousers();
	}

	@Override
	public IShoes createShoes() {
		return new BossShoes();
	}
	
}
