package epicSortingVisualiser;


public class OldHeapSort {
	
	public static int iParent(int i) {
		return (int) Math.floor((i - 1) / 2.0);
	}
	
	public static int iLeftChild(int i) {
		return (2 * i) + 1;
	}
	
	public static int iRightChild(int i) {
		return (2 * i) + 2;
	}
	
	public static void swap(int[] A, int a, int b) {
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	
	public static void heapify(int[] A, int n) {
		int start = iParent(n - 1);
		while (start >= 0) {
			siftDown(A, start, n - 1);
			start--;
		}
	}

	
	public static void siftDown(int[] A, int start, int end) {
		int root = start;
		
		while (iLeftChild(root) <= end) {
			int child = iLeftChild(root);
			int swap = root;
			
			if (A[swap] < A[child]) {
				swap = child;
			}
			
			if (child + 1 <= end && A[swap] < A[child + 1]) {
				swap = child + 1;
			}
			
			if (swap == root) {
				return;
			} else {
				swap(A, root, swap);
				root = swap;
			}
		}
	}
	
	public static int[] heapSort(int[] A) {
		int n = A.length;
		heapify(A, n);
		int end = n - 1;
		
		while (end > 0) {
			swap(A, end, 0);
			end--;
			siftDown(A, 0, end);
		}
		
		return A;
	}
}
