import javax.swing.JButton;
import javax.swing.JFrame;

public class SecondPractice{
	public static void main(String[] args){
		JFrame frame = new JFrame("CSC1850-20251117");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Click: ");
		frame.add(button);

		MyFirstActionListener listener = new MyFirstActionListener();
		button.addActionListener(listener);

		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
// java MyFirstActionListener
// Java SecondPractice
// java ThirdPractice