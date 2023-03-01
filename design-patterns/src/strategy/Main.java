package strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import strategy.compare.IComparer;
import strategy.compare.UserByAgeAsc;
import strategy.compare.UserByFullNameAsc;
import strategy.sort.BubbleSort;
import strategy.sort.ISorter;
import strategy.sort.MergeSort;
import strategy.sort.QuickSort;
import strategy.user.User;
import strategy.user.UserBuilder;
import strategy.user.UserList;

public class Main {
	public static String[] FIRST_NAMES = { "Tuomas", "Mikko", "Matti", "Jorgos" };
	public static String[] LAST_NAMES = { "Möttönen", "Meikäläinen", "Ukkeli", "Bazinga" };
	public static int MAX_AGE = 90;
	public static int MIN_AGE = 20;
	public static int SAMPLE_SIZE = 10000;

	/**
	 * Setup UserList instance for testing different sorting algorithms.
	 * 
	 * Comparison & sorting are handled by strategies.
	 * 
	 * Users constructed with a builder.
	 */
	public static UserList setup(IComparer<User> comparer, ISorter sorter) {
		List<String> firstNames = new ArrayList<>(Arrays.asList(FIRST_NAMES));
		List<String> lastNames = new ArrayList<>(Arrays.asList(LAST_NAMES));

		UserBuilder builder = new UserBuilder().setComparer(comparer);

		UserList users = new UserList(sorter);

		for (int i = 0; i < SAMPLE_SIZE; i++) {
			User user = builder
					.setAge(intBetween(MIN_AGE, MAX_AGE))
					.setFirstName(sample(firstNames))
					.setLastName(sample(lastNames))
					.build();

			users.add(user);
		}

		return users;
	}

	public static void test(UserList users, String desc) {
		System.out.println(desc + " for " + users.size() + " users");
		Long start = System.nanoTime();
		List<User> sorted = users.sort();
		Long end = System.nanoTime();

//		for (User u : sorted) {
//			System.out.println(u);
//		}

		System.out.println("took " + ((end - start) / 1000000) + " ms\n");
	}

	public static void main(String[] args) {
		UserList users;

		ISorter bubbleSort = new BubbleSort();
		ISorter quickSort = new QuickSort();
		ISorter mergeSort = new MergeSort();

		IComparer<User> byAgeasc = new UserByAgeAsc();
		IComparer<User> byAgeDesc = (a, b) -> b.getAge() - a.getAge();
		IComparer<User> byNameasc = new UserByFullNameAsc();

		users = setup(byAgeasc, bubbleSort);
		test(users, "Bubble sort & asc age comparison");

		users = setup(byAgeasc, quickSort);
		test(users, "Quick sort & asc age comparison");

		users = setup(byAgeasc, mergeSort);
		test(users, "Merge sort & asc age comparison");

		users = setup(byAgeDesc, bubbleSort);
		test(users, "Bubble sort & inline desc age comparison");

		users = setup(byAgeDesc, quickSort);
		test(users, "Quick sort & inline desc age comparison");

		users = setup(byAgeDesc, mergeSort);
		test(users, "Merge sort & inline desc age comparison");

		users = setup(byNameasc, bubbleSort);
		test(users, "Bubble sort & asc full name comparison");

		users = setup(byNameasc, quickSort);
		test(users, "Quick sort & asc full name comparison");

		users = setup(byNameasc, mergeSort);
		test(users, "Merge sort & asc full name comparison");

//		RESULTS:

//		Bubble sort & asc age comparison for 10000 users
//		took 363 ms
//
//		Quick sort & asc age comparison for 10000 users
//		took 9 ms
//
//		Merge sort & asc age comparison for 10000 users
//		took 4 ms
//
//		Bubble sort & inline desc age comparison for 10000 users
//		took 367 ms
//
//		Quick sort & inline desc age comparison for 10000 users
//		took 9 ms
//
//		Merge sort & inline desc age comparison for 10000 users
//		took 1 ms
//
//		Bubble sort & asc full name comparison for 10000 users
//		took 6038 ms
//
//		Quick sort & asc full name comparison for 10000 users
//		took 185 ms
//
//		Merge sort & asc full name comparison for 10000 users
//		took 17 ms
	}
	

	/**
	 * Get random item from list
	 */
	public static <T> T sample(List<T> l) {
		return l.get(ThreadLocalRandom.current().nextInt(l.size()));
	}

	/**
	 * Get random integer between range
	 */
	public static int intBetween(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
}
