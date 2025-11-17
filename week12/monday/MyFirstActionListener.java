import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class MyFirstActionListener implements ActionListener{
	private int count = 0;

	public void actionPerformed(ActionEvent event){
		count++;
		JButton clickedButton = (JButton) event.getSource();
		clickedButton.setText("Clicks: " + count);
	}
}