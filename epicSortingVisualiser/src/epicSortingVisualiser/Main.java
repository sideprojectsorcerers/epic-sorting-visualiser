package epicSortingVisualiser;
import java.util.Random;
import sortingAlgos.*;

public class Main {

	public static void main(String[] args) {
		//GUI init
		GUI.draw();
		
		//Init of array: 255 elements from 0 to 255 which are then shuffled
		int array[] = new int[256];
		for (int i=255; i>=0; i--) {
			array[i] = i;
		}
		shuffleArray(array);
		
		//call sorting algorithms
		printArray(array);
		
		//array = BubbleSort.bubbleSortDriver(array);
		//array = SelectionSort.selectionSortDriver(array);
		//array = InsertionSort.insertionSortDriver(array);
		//array = HeapSort.heapSortDriver(array);
		//array = MergeSort.mergeSortDriver(array);
		array = QuickSort.quickSortDriver(array);
		
		printArray(array);
	}
	
	public static void printArray(int[] a) {
		//prints an array
		System.out.print("[");
		for (int i=0; i<a.length-1; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println(a[a.length-1] + "]");
	}
	
	public static void shuffleArray(int[] a) {
		Random rand = new Random();
		for (int i=a.length-1; i>=0; i--) {
		      int swap = rand.nextInt(i + 1);
		      int temp = a[swap];
		      a[swap] = a[i];
		      a[i] = temp;
		}
	}
}
