package epicSortingVisualiser;

public class BubbleSort {
	public static int[] bubbleSort(int[] a) {
		//bog standard bubble sort
		int n = a.length;
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-i-1; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
}
