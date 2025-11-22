import javax.swing.*;
import java.awt.event.*;

public class SimpleLogin{
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(20, 20, 80, 25);
        frame.add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(110, 20, 150, 25);
        frame.add(userField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(20, 60, 80, 25);
        frame.add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(110, 60, 150, 25);
        frame.add(passField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(100, 100, 80, 30);
        frame.add(loginBtn);

        JLabel msg = new JLabel("");
        msg.setBounds(20, 140, 250, 25);
        frame.add(msg);

        loginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String pass = new String(passField.getPassword());

                if (user.equals("admin") && pass.equals("1234")) {
                    msg.setText("Login Successful!");
                } else {
                    msg.setText("Invalid Login!");
                }
            }
        });

        frame.setVisible(true);
    }
}
