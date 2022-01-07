package sortingAlgos;

public class SelectionSort {
	public static int[] selectionSortDriver(int[] A) {
		selectionSort(A);
		return A;
	}
	
	public static void selectionSort(int[] A) {
		int n = A.length;
		for (int i=n-1; i>=0; i--) {
			int maxKey = i;
			for (int j=0; j<i; j++) {
				if (A[j] > A[maxKey]) {
					maxKey = j;
				}
			}
			int temp = A[i];
			A[i] = A[maxKey];
			A[maxKey] = temp;
 		}
	}
}
