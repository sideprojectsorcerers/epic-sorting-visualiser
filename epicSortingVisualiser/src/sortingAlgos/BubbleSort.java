package sortingAlgos;

public class BubbleSort {
	public static int[] bubbleSortDriver(int[] A) {
		bubbleSort(A);
		return A;
	}
	
	public static void bubbleSort(int[] A) {
		int n = A.length;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-i-1; j++) {
				if (A[j] > A[j+1]) {
					int temp = A[j];
					A[j] = A[j+1];
					A[j+1] = temp;
				}
			}
		}
		
	}
}
