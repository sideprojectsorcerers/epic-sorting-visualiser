package epicSortingVisualiser;

import java.util.Random;

public class Utils {
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
	
	public static int[] getRandomArray(int length) {
		int[] array = new int[length];
		Random rand = new Random();
		for (int i=0; i<length; i++) {
			array[i] = rand.nextInt();
		}
		return array;
	}
}
