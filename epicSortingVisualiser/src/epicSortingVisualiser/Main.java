package epicSortingVisualiser;
import java.util.Arrays;

import sortingAlgos.*;

public class Main {

	public static void main(String[] args) {
		//GUI init
		//GUI.draw();
		
		//Timing
		timing();
	}
	
	public static void timing() {
		int runs = 100;
		long bubbleTime = 0;
		long selectionTime = 0;
		long insertionTime = 0;
		long heapTime = 0;
		long mergeTime = 0;
		long quickTime = 0;
		long arraysTime = 0;
		
		for (int i=0; i<runs; i++) {
			//Init of array, shuffle
			int array[] = new int[10000];
			for (int j=array.length-1; j>=0; j--) {
				array[j] = j;
			}
			Utils.shuffleArray(array);
			
			//bubbleSort
			long bST = System.currentTimeMillis();
			BubbleSort.bubbleSortDriver(Arrays.copyOf(array, array.length));
			long bET = System.currentTimeMillis();
			bubbleTime += delta(bST, bET);
			
			//selectionSort
			long sST = System.currentTimeMillis();
			SelectionSort.selectionSortDriver(Arrays.copyOf(array, array.length));
			long sET = System.currentTimeMillis();
			selectionTime += delta(sST, sET);
			
			//insetionSort
			long iST = System.currentTimeMillis();
			InsertionSort.insertionSortDriver(Arrays.copyOf(array, array.length));
			long iET = System.currentTimeMillis();
			insertionTime += delta(iST, iET);
			
			//heapSort
			long hST = System.currentTimeMillis();
			HeapSort.heapSortDriver(Arrays.copyOf(array, array.length));
			long hET = System.currentTimeMillis();
			heapTime += delta(hST, hET);
			
			//mergeSort
			long mST = System.currentTimeMillis();
			MergeSort.mergeSortDriver(Arrays.copyOf(array, array.length));
			long mET = System.currentTimeMillis();
			mergeTime += delta(mST, mET);
			
			//quickSort
			long qST = System.currentTimeMillis();
			QuickSort.quickSortDriver(Arrays.copyOf(array, array.length));
			long qET = System.currentTimeMillis();
			quickTime += delta(qST, qET);
			
			//arraysSort
			long aST = System.currentTimeMillis();
			Arrays.sort(Arrays.copyOf(array, array.length));
			long aET = System.currentTimeMillis();
			arraysTime += delta(aST, aET);
		}
		
		System.out.println("Bubble Sort Avg.: " + (double) bubbleTime / runs + "ms");
		System.out.println("Selection Sort Avg.: " + (double) selectionTime / runs + "ms");
		System.out.println("Insertion Sort Avg.: " + (double) insertionTime / runs + "ms");
		System.out.println("Heap Sort Avg.: " + (double) heapTime / runs + "ms");
		System.out.println("Merge Sort Avg.: " + (double) mergeTime / runs + "ms");
		System.out.println("Quick Sort Avg.: " + (double) quickTime / runs + "ms");
		System.out.println("Arrays.sort Avg.: " + (double) arraysTime / runs + "ms");
		
	}
	
	public static long delta(long l1, long l2) {
		return l2 - l1;
	}
}
