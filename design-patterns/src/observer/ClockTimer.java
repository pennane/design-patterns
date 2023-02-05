package observer;

import java.time.LocalDateTime;
import java.util.concurrent.SubmissionPublisher;

public class ClockTimer extends SubmissionPublisher<LocalDateTime> implements Runnable {
	@Override
	public void run() {
		while (true) {
			submit(LocalDateTime.now());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
