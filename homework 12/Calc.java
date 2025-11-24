import javax.swing.*;


class Calc{
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JButton b0 = new JButton("");

        b0.setBounds(150, 200, 220, 50);

        frame.add(b0);

        frame.setSize(500, 600);

        frame.setLayout(null);

        frame.setVisible(true);

    }
}