package sortingAlgos;

public class QuickSort {
	public static int[] quickSortDriver(int[] A) {
		quickSort(A, 0, A.length-1);
		return A;
	}
	
	public static void quickSort(int[] A, int left, int right) {
		if (left < right) {
			int border = partition(A, left, right);
			quickSort(A, left, border-1);
			quickSort(A, border + 1, right);
		}
	}
	
	public static int partition(int[] A, int left, int right) {
		int i = left;
		int j = right - 1;
		int pivot = A[right];
		
		do {
			while (i < right && A[i] < pivot) {
				i++;
			}
			while (j>left && A[j] > pivot) {
				j--;
			}
			if (i < j) {
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		} while (i < j);
		
		int temp = A[right];
		A[right] = A[i];
		A[i] = temp;
		
		return i;
	}
}
