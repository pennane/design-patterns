package command;

public class RollUp implements ICommand {
	private Screen screen;

	public RollUp(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		screen.rollUp();
	}

	@Override
	public void unexecute() {
		screen.rollDown();
	}

}
