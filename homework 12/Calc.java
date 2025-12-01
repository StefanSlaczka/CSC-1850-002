import javax.swing.*;

class Calc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Adder");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Input 1
        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 200, 30);
        frame.add(t1);

        // Input 2
        JTextField t2 = new JTextField();
        t2.setBounds(150, 100, 200, 30);
        frame.add(t2);

        // Add Button
        JButton addButton = new JButton("Add");
        addButton.setBounds(150, 160, 200, 40);
        frame.add(addButton);

        // Result Label
        JLabel result = new JLabel("Result = ");
        result.setBounds(150, 220, 300, 40);
        frame.add(result);

        // Button Action
        addButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(t1.getText());
                double num2 = Double.parseDouble(t2.getText());
                double sum = num1 + num2;
                result.setText("Result = " + sum);
            } catch (NumberFormatException ex) {
                result.setText("Invalid input! Enter numbers only.");
            }
        });

        frame.setVisible(true);
    }
}
