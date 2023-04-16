package prototype;

public class Hand implements Cloneable {
	private Integer value;

	public Hand(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public String getReadableValue() {
		return String.format("%02d", value);
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}
