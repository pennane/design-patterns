package prototype;

public class Clock implements Cloneable {
	private Hand hourHand;
	private Hand minuteHand;

	public Clock(Hand hourHand, Hand minuteHand) {
		this.hourHand = hourHand;
		this.minuteHand = minuteHand;
	}

	public void setHours(int hours) {
		hourHand.setValue(hours);
	}

	public void setMinutes(int minutes) {
		minuteHand.setValue(minutes);
	}

	public void printTime() {
		System.out.println(hourHand.getReadableValue() + ":" + minuteHand.getReadableValue());
	}

	@Override
	public Clock clone() {
		Clock clock = null;
		try {
			clock = (Clock) super.clone();
			clock.hourHand = (Hand) hourHand.clone();
			clock.minuteHand = (Hand) minuteHand.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clock;
	}

	public Clock shallowClone() {
		Clock clock = null;
		try {
			clock = (Clock) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clock;
	}
}
