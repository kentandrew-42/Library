import javax.swing.*;

public class MainFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Library Manager");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton b = new JButton("Don't Click This Button");
		b.setBounds(200,200,200,200);
		frame.add(b);

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("On the Shelves");
		menuBar.add(menu);

		JMenuItem firstItem = new JMenuItem("Does nothing.");
		JMenuItem secondItem = new JMenuItem("Also does nothing.");
		menu.add(firstItem);
		menu.add(secondItem);
		
		frame.add(menuBar);

		frame.setSize(750, 750);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
