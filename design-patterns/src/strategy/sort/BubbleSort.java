package strategy.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import strategy.user.User;

public class BubbleSort implements ISorter {
	private void bubbleSort(User array[]) {
		int n = array.length;
		int k;
		for (int m = n; m >= 0; m--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i].compareTo(array[k]) > 0) {
					swap(i, k, array);
				}
			}
		}
	}

	private void swap(int i, int j, User[] array) {
		User temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	@Override
	public List<User> sort(List<User> list) {
		User[] array = new User[list.size()];
		list.toArray(array);
		bubbleSort(array);
		return new ArrayList<>(Arrays.asList(array));
	}
}
