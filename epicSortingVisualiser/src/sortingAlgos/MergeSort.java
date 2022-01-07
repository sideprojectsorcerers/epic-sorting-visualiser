package sortingAlgos;

public class MergeSort {
	public static int[] mergeSortDriver(int[] A) {
		mergeSort(A, 0, A.length-1);
		return A;
	}
	
	public static void mergeSort(int[] A, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			mergeSort(A, left, middle);
			mergeSort(A, middle + 1, right);
			merge(A, left, middle, right);
		}
	}
	
	public static void merge(int[] A, int left, int middle, int right) {
		int sizeL = middle - left + 1;
		int sizeR = right - middle;
		
		int[] leftA = new int[sizeL];
		int[] rightA = new int[sizeR];
		
		for (int i=0; i<sizeL; i++) {
			leftA[i] = A[left + i];
		}
		for (int i=0; i<sizeR; i++) {
			rightA[i] = A[middle + 1 + i];
		}
		
		int i=0;
		int j=0;
		int k = left;
		
		while (i<sizeL && j<sizeR) {
			if (leftA[i] > rightA[j]) {
				A[k++] = rightA[j++];
			}
			else {
				A[k++] = leftA[i++];
			}
		}
		
		while (i<sizeL) {
			A[k++] = leftA[i++];
		}
		while (j<sizeR) {
			A[k++] = rightA[j++];
		}
	}
}
