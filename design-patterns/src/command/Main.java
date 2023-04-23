package command;

public class Main {
	public static void main(final String[] args) {
		Screen screen = new Screen(Screen.Position.HIDDEN);
		Buttons buttons = new Buttons(new RollUp(screen), new RollDown(screen));

		System.out.println(screen.toString());
		// a screen that is rolled up and very hidden :(

		buttons.pressDown();
		System.out.println(screen.toString());
		// a screen that is rolled down and very visible! :)

		buttons.pressUp();
		System.out.println(screen.toString());
		// a screen that is rolled up and very hidden :(
	}
}
