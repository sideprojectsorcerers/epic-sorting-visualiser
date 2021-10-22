package epicSortingVisualiser;

public class MergeSort {
	public static void mergeSort(int[] a, int n) {
		if (n <= 1) {
			return;
		}
		int middle = n/2;
		int[] left = new int[middle];
		int[] right = new int[n-middle];
		
		for (int i=0; i<middle; i++) {
			left[i] = a[i];
		}
		for (int i=middle; i<n; i++) {
			right[i - middle] = a[i];
		}
		
		mergeSort(left, middle);
		mergeSort(right, n-middle);
		merge(a, left, right, middle, n-middle);
	}
	
	public static void merge(int[]a , int[] l, int[] r, int left, int right) {
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < left && j < right) {
			if(l[i] < r[i]) {
				a[k] = l[i];
				k++;
				i++;
			}
			else {
				a[k] = r[j];
				k++;
				j++;
				
			}
		}
		
		while (i < left) {
			a[k] = l[i];
			k++;
			i++;
		}
		while (j < right) {
			a[k] = r[j];
			k++;
			j++;
		}
	}
}
