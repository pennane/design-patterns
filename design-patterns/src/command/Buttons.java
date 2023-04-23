package command;

/**
 * Command invoker
 */
public class Buttons {
	ICommand upButton;
	ICommand downButton;

	public Buttons(ICommand upButton, ICommand downButton) {
		this.upButton = upButton;
		this.downButton = downButton;
	}

	public void pressUp() {
		upButton.execute();
	}

	public void pressDown() {
		downButton.execute();
	}
}
