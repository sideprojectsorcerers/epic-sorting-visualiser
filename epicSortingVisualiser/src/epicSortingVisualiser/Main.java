package epicSortingVisualiser;
import java.util.Scanner;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
		//Basic initialisation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter desired array length:");
		int length = scan.nextInt();
		int[] array = new int[length];
		System.out.println("Enter " + length + " array elements:");
		for (int i=0; i<length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();
		
		//GUI Test
		JFrame frame = new JFrame();
		frame.setVisible(true);
		//calling sorting algorithms
		BubbleSort.bubbleSort(array);
		printArray(array);
	}
	
	public static void printArray(int[] a) {
		//prints an array
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
