package strategy.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import strategy.user.User;

public class QuickSort implements ISorter {
	private void swap(User[] arr, int i, int j) {
		User temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private int partition(User[] arr, int low, int high) {
		User pivot = arr[high];

		int i = low - 1;

		for (int j = low; j <= high - 1; j++) {
			if (arr[j].compareTo(pivot) < 0) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return (i + 1);
	}

	private void quickSort(User[] arr, int low, int high) {
		if (low < high) {

			// pi is partitioning index, arr[p]
			// is now at right place
			int pi = partition(arr, low, high);

			// Separately sort elements before
			// partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	@Override
	public List<User> sort(List<User> list) {
		User[] array = new User[list.size()];
		list.toArray(array);
		quickSort(array, 0, list.size() - 1);
		return new ArrayList<>(Arrays.asList(array));
	}

}
