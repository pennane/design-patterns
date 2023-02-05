package observer;

import java.time.LocalDateTime;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class DigitalClock implements Subscriber<LocalDateTime> {

	Subscription subscription = null;

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(LocalDateTime timestamp) {
		System.out.println(timestamp.getHour() + ":" + timestamp.getMinute() + ":" + timestamp.getSecond());
		subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println("error");
	}

	@Override
	public void onComplete() {
		System.out.println("done");
	}
}
