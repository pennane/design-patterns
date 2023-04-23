package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class AdditionalTesting {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(5);
		for (int i = 0; i < 5; i++) {
			numbers.add(i);
		}

		Iterator<Integer> iterator1 = numbers.iterator();

		while (iterator1.hasNext()) {
			int num = iterator1.next();
			System.out.println("while   : " + num);
			iterator1.forEachRemaining(v -> System.out.println("forEach : " + v));
		}

		Thread thread1 = new Thread(() -> {
			var iterator2 = numbers.iterator();
			while (iterator2.hasNext()) {
				int num = iterator2.next();
				if (num % 2 == 0) {
					System.out.println("Thread 1: Removing " + num);
					iterator2.remove();
				}
			}
		});

		Thread thread2 = new Thread(() -> {
			var iterator3 = numbers.iterator();
			while (iterator3.hasNext()) {
				System.out.println("Thread 2: Found " + iterator3.next());
			}
		});

		thread1.start();
		thread2.start();

	}

}
