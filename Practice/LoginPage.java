import javax.swing.*;
import java.awt.*;

public class LoginPage{

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // using absolute layout

        // Title label
        JLabel title = new JLabel("Login Page");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(130, 20, 200, 30);
        frame.add(title);

        // Username label
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 100, 25);
        frame.add(userLabel);

        // Username TextField
        JTextField userField = new JTextField();
        userField.setBounds(150, 80, 180, 25);
        frame.add(userField);

        // Password label
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 120, 100, 25);
        frame.add(passLabel);

        // Password Field
        JPasswordField passField = new JPasswordField();
        passField.setBounds(150, 120, 180, 25);
        frame.add(passField);

        // Login Button
        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(150, 170, 100, 30);
        frame.add(loginBtn);

        // Make page visible
        frame.setVisible(true);
    }
}
