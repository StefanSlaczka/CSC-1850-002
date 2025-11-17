import java.awt.BorderLayout;
import javax.swing.*;

public class FirstPractice{

    public FirstPractice() {
        JFrame frame = new JFrame("Thanksgiving is coming ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout( new BorderLayout() );

        JButton button= new JButton("Button");
        JLabel label = new JLabel("Label");
        JCheckBox checkBox = new JCheckBox("Checkbox");
        JTextArea testArea = new JTextArea("TextArea");

        panel.add(button, BorderLayout.NORTH);
        panel.add(label, BorderLayout.EAST);
        panel.add(checkBox, BorderLayout.WEST);
        panel.add(testArea, BorderLayout.SOUTH);

        frame.add(panel);

        frame.setSize(1000, 1000);
        frame.setLocation(500, 500);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new FirstPractice();
    }
}