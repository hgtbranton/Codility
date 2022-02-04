package lessons.l3;

public class PermMissingElem {
	public static int solution(int[] A) { // 90% but 80% without empty array fuckery

		A = quickSort(A, 0, A.length - 1);

		for (int i = 0; i < A.length - 1; i++) {
			if (A[i + 1] - A[i] > 1) {
				return A[i] + 1;
			}
		}

		// if the list is empty, the missing number would be 1?
		if (A.length == 0) {
			return 1;
		} else if (A[0] >= 2) { // if the first element is >=2 then 1 is missing, so return 1
			return 1;
		} else {
			return A[A.length - 1] + 1; // last element missing
		}
	}

	public static int[] quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// pi is partitioning index, arr[pi] is now at right place
			int pi = partition(arr, low, high);

			quickSort(arr, low, pi - 1); // Before pi
			quickSort(arr, pi + 1, high); // After pi
		}
		return arr;
	}

	public static int partition(int[] arr, int low, int high) {
		// pivot (Element to be placed at right position)
		int pivot = arr[high];

		int i = (low - 1); // Index of smaller element and indicates the
		// right position of pivot found so far

		for (int j = low; j <= high - 1; j++) {
			// If current element is smaller than the pivot
			if (arr[j] < pivot) {
				i++; // increment index of smaller element
				int t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
			}
		}
		int t = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = t;

		return (i + 1);
	}

}
