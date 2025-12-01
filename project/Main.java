import javax.swing.*;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TikTacToe");
        frame.setSize(500, 600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton[] buttons = new JButton[9];

        int xStart = 100;
        int yStart = 100;
        int size = 100;
        int index = 0;

        // Creates 3*3 grid of buttons

        for(int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                buttons[index] = new JButton("Pick Me");
                buttons[index].setBounds(
                    xStart + col * size,
                    yStart + row * size,
                    size, size
                );
                frame.add(buttons[index]);
                index++;
            }
        }
        
        frame.setVisible(true);
    }
}
