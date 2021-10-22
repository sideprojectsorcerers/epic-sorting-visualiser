package epicSortingVisualiser;
import javax.swing.*;

public class GUI {
	public static void draw() {
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
	}
}
