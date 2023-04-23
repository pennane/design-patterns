package iterator;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Modification {

	public static void main(String[] args) throws InterruptedException {

		ArrayList<Integer> numbers = new ArrayList<>(100);
		for (int i = 0; i < 100; i++) {
			numbers.add(i);
		}

		Thread thread1 = new Thread(() -> {
			var iterator = numbers.iterator();
			while (iterator.hasNext()) {
				try {
					Thread.sleep(ThreadLocalRandom.current().nextInt(0, 20));
					int next = iterator.next();
					numbers.set(next, next * -1);
				} catch (InterruptedException e) {
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			var iterator = numbers.iterator();
			while (iterator.hasNext()) {
				try {
					Thread.sleep(ThreadLocalRandom.current().nextInt(0, 20));
					System.out.println(iterator.next());
				} catch (InterruptedException e) {
				}
			}
		});

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();
	}

}
