package sortingAlgos;

public class InsertionSort {
	public static int[] insertionSortDriver(int[] A) {
		insertionSort(A);
		return A;
	}
	
	public static void insertionSort(int[] A) {
		int n = A.length;
		for (int i=1; i<n; i++) {
			int val = A[i];
			int j=i-1;
			while (j>=0 && A[j] > val) {
				A[j+1] = A[j];
				j--;
			}
			A[j + 1] = val;
		}
	}
 
}
