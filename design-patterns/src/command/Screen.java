package command;

public class Screen {
	public enum Position {
		HIDDEN, SHOWN
	}

	private Position position;

	public Screen(Position initialPosition) {
		this.position = initialPosition;
	}

	public void rollUp() {
		position = Position.HIDDEN;
	}

	public void rollDown() {
		position = Position.SHOWN;
	}

	@Override
	public String toString() {
		switch (position) {
		case HIDDEN: {
			return "a screen that is rolled up and very hidden :(";
		}
		case SHOWN: {
			return "a screen that is rolled down and very visible! :)";
		}
		default: {
			return "a silver screen that is in an abnormal position.";
		}
		}
	}
}
