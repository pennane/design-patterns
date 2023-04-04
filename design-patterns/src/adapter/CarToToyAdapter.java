package adapter;

public class CarToToyAdapter {
	public IToy adapt(ICar car) {
		return new IToy() {
			@Override
			public String describe() {
				return "Lelu" + car.describe();
			}

			@Override
			public String toyWith() {
				return car.drive();
			}
		};
	}
}