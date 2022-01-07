package sortingAlgos;
import java.util.PriorityQueue;

public class HeapSort {
	public static int[] heapSortDriver(int[] A) {
		heapSort(A);
		return A;
	}
	
	public static void heapSort(int[] A) {
		int n = A.length;
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for (int i=0; i<n; i++) {
			heap.add(A[i]);
		}
		
		for (int i=0; i<n; i++) {
			A[i] = heap.poll();
		}
	}
}
