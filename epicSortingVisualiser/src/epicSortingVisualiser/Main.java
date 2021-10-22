package epicSortingVisualiser;
import java.util.Scanner;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//GUI init
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 300);
		JLabel label1 = new JLabel("Pick desired algorithm");
		JRadioButton bubble = new JRadioButton();
		JRadioButton insertion = new JRadioButton();
		ButtonGroup bg = new ButtonGroup();
		bg.add(bubble);
		bg.add(insertion);
		frame.add(label1);
		frame.add(bubble);
		frame.add(insertion);
		
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
