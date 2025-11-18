import javax.swing.*;
import java.awt.*;

public class SimplePage{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing Page");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        panel.add(new JLabel("Name:"));
        panel.add(new JTextField());

        panel.add(new JLabel("Email:"));
        panel.add(new JTextField());

        panel.add(new JButton("Submit"));
        panel.add(new JButton("Cancel"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
