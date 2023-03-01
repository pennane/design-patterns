package strategy.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import strategy.user.User;

public class MergeSort implements ISorter {
	private void merge(User arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		User L[] = new User[n1];
		User R[] = new User[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i].compareTo(R[j]) <= 0) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	private void mergeSort(User arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;

			// Sort first and second halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	@Override
	public List<User> sort(List<User> list) {
		User[] array = new User[list.size()];
		list.toArray(array);
		mergeSort(array, 0, list.size() - 1);
		return new ArrayList<>(Arrays.asList(array));
	}

}
