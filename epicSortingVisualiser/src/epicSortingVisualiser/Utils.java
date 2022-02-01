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
	
	public static int[] getReverseArray(int length) {
		int array[] = new int[length];
		for (int i=0; i<length; i++) {
			array[i] = length-i-1;
		}
		return array;
	}
	
	public static int[] getNearlySortedArray(int length) {
		int array[] = new int[length];
		for(int i=0; i<length; i++) {
			array[i] = i;
		}
		smallShuffle(array);
		return array;
	}
	
	public static void smallShuffle(int[] a) {
		Random rand = new Random();
		for (int i=0; i<a.length/100; i++) {
		      int r1 = rand.nextInt(a.length);
		      int r2 = rand.nextInt(a.length);
		      int temp = a[r1];
		      a[r1] = a[r2];
		      a[r2] = temp;
		}
	}
}
