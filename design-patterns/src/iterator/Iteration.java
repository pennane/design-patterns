package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<Integer> numbers = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			numbers.add(i);
		}

		Iterator<Integer> sharedIterator = numbers.iterator();

		Thread thread1 = new Thread(() -> {
			while (sharedIterator.hasNext()) {
				var num = sharedIterator.next();
				System.out.println("Shared iterator: Thread 1: got " + num);
			}
		});

		Thread thread2 = new Thread(() -> {
			while (sharedIterator.hasNext()) {
				var num = sharedIterator.next();
				System.out.println("Shared iterator: Thread 2: got " + num);
			}
		});

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		Thread thread3 = new Thread(() -> {
			Iterator<Integer> iterator = numbers.iterator();
			while (iterator.hasNext()) {
				var num = iterator.next();
				System.out.println("Own iterators: Thread 3: got " + num);
			}
		});

		Thread thread4 = new Thread(() -> {
			Iterator<Integer> iterator = numbers.iterator();
			while (iterator.hasNext()) {
				var num = iterator.next();
				System.out.println("Own iterators: Thread 4: got " + num);
			}
		});

		thread3.start();
		thread4.start();

		thread3.join();
		thread4.join();

		for (int i = 0; i < 100; i++) {
			Iterator<Integer> sharedIterator1 = numbers.iterator();

			Thread thread11 = new Thread(() -> {
				while (sharedIterator1.hasNext()) {
					var num = sharedIterator1.next();
					System.out.println("Shared iterator: Thread 1: got " + num);
				}
			});

			Thread thread21 = new Thread(() -> {
				while (sharedIterator1.hasNext()) {
					var num = sharedIterator1.next();
					System.out.println("Shared iterator: Thread 2: got " + num);
				}
			});
			thread11.start();
			thread21.start();
			thread11.join();
			thread21.join();
		}
	}

}
