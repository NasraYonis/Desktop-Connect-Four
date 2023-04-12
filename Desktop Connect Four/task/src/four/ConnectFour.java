package four;

import javax.swing.*;
import java.awt.*;


public class ConnectFour extends JFrame {
    private static final int ROWS = 6;
    private static final int COLS = 7;

    public ConnectFour() {
        super("Connect Four");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel board = new JPanel(new GridLayout(ROWS + 1, COLS));
        JLabel[] labels = {new JLabel("A"), new JLabel("B"), new JLabel("C"),
                new JLabel("D"), new JLabel("E"), new JLabel("F"),
                new JLabel("G")};
        for (JLabel label : labels) {
            label.setHorizontalAlignment(SwingConstants.CENTER);
            board.add(label);
        }
        for (int row = 1; row <= ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                JButton cell = new JButton();
                cell.setFocusPainted(false);
                cell.setName("Button" + row + (char) ('A' + col));
                cell.setText((char) ('A' + col) + String.valueOf(row));
                board.add(cell);
            }
        }
        add(board);

        pack();
        setVisible(true);

    }
}
