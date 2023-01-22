package abstractfactory;

import java.io.IOException;
import java.util.Properties;

public class Jasper {
	private ICap cap;
	private IShirt shirt;
	private ITrousers trousers;
	private IShoes shoes;

	public IApparelFactory createApparelFactory() {
		Class c = null;
		IApparelFactory apparelFactory = null;
		Properties properties = new Properties();
		try {
			properties.load(this.getClass().getResourceAsStream("jasper.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			c = Class.forName(properties.getProperty("apparel"));
			apparelFactory = (IApparelFactory) c.getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return apparelFactory;
	}

	public void dressUp(IApparelFactory apparelFactory) {
		this.cap = apparelFactory.createCap();
		this.shirt = apparelFactory.createShirt();
		this.shoes = apparelFactory.createShoes();
		this.trousers = apparelFactory.createTrousers();
	}

	public String toString() {
		return "Täs mä Jasper. Mulla on päällä " + cap + ", " + shirt + ", " + trousers + ", ja " + shoes;
	}
}
