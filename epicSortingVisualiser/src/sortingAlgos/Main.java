package sortingAlgos;
import java.util.Random;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int array[] = new int[20];
		for (int i=array.length-1; i>=0; i--) {
			array[i] = i;
		}
		shuffleArray(array);
		System.out.println(Arrays.toString(array));

		//array = BubbleSort.bubbleSortDriver(array);
		//array = SelectionSort.selectionSortDriver(array);
		//array = InsertionSort.insertionSortDriver(array);
		//array = HeapSort.heapSortDriver(array);
		//array = MergeSort.mergeSortDriver(array);
		array = QuickSort.quickSortDriver(array);
		
		System.out.println(Arrays.toString(array));
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
