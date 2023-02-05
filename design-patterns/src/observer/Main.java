package observer;

public class Main {
	public static void main(String[] args) {

		/**
		 * Observer pattern with java Flow API and threads
		 */

		ClockTimer clockTimer = new ClockTimer();
		Thread timerThread = new Thread(clockTimer);

		DigitalClock digitalClock = new DigitalClock();

		timerThread.start();
		clockTimer.subscribe(digitalClock);
	}
}
