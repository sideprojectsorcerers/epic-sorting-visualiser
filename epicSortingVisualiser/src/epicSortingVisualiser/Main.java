package epicSortingVisualiser;
import java.util.Random;


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
		
		//calling sorting algorithms
		//BubbleSort.bubbleSort(array);
		printArray(array);
		System.out.println("----------------------------------");
		//MergeSort.mergeSort(array, array.length);
		HeapSort.heapSort(array);
		printArray(array);
	}
	
	public static void printArray(int[] a) {
		//prints an array
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
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
