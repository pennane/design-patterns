package command;

public class RollDown implements ICommand {

	private Screen screen;

	public RollDown(Screen screen) {
		this.screen = screen;
	}

	@Override
	public void execute() {
		screen.rollDown();
	}

	@Override
	public void unexecute() {
		screen.rollUp();
	}

}
