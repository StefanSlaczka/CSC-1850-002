import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ThirdPractice{
	public static void main(String[] args){
		JFrame frame = new JFrame("CSC1850-20251117");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
	
		JButton button = new JButton("Click here");
		panel.add(button);

		JTextArea ta = new JTextArea("Click: 0");
		panel.add(ta);

		MySecondActionListener listener = new MySecondActionListener(ta);
		button.addActionListener(listener);

		frame.add(panel);

		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}	