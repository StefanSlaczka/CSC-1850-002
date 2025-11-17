import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class MySecondActionListener implements ActionListener {
	private int count = 0;
	private JTextArea ta;

	public MySecondActionListener(JTextArea ta) {
		this.ta = ta;
	}

	public void actionPerformed(ActionEvent event){
	 	count ++;
		ta.setText("Clicks: " + count);
	}
}