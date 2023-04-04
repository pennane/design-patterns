package adapter;

public class SuperCar implements ICar {

	@Override
	public String drive() {
		return "NYT AJELLAAN LAITTOMAN TÄYSII :D";
	}

	@Override
	public String describe() {
		return "auto jolla pääsee lujaa";
	}

}
