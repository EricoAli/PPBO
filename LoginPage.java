import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {

    //constructor
    public LoginPage(){

        //bikin window
        setTitle("Sistem Informasi Akademis");
        setSize(300, 200);
        setLocationRelativeTo(null); //biar open panel/window di tengah layar

        // bikin panel title login
        JPanel panel = new JPanel(new BorderLayout());
        add(panel);
        // bikin label untuk panel title loginnya
        JLabel label = new JLabel("Please Login", JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 10));
        panel.add(label, BorderLayout.NORTH);

        // bikin button
        JButton button = new JButton("Login");
        panel.add(button, BorderLayout.SOUTH);

        // bikin field
        JPanel fieldPanel = new JPanel(new GridLayout(2, 2));

        // bikin field username
        fieldPanel.add(new JLabel("Username"));
        JTextField usernameField = new JTextField();
        fieldPanel.add(usernameField);

        // field password
        fieldPanel.add(new JLabel("Password"));
        JPasswordField passwordField = new JPasswordField();
        fieldPanel.add(passwordField);

        panel.add(fieldPanel); //masukin panel field ke panel/windownya

        // logic login
        button.addActionListener( e -> {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (username.equals("Admin") && password.equals("12345")) {
            JOptionPane.showMessageDialog(this, "Login berhasil");
            dispose();
            new Dashboard().setVisible(true);
            } else {
            JOptionPane.showMessageDialog(this, "Username atau salah");
            usernameField.setText("");
            passwordField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                ()-> new LoginPage().setVisible(true)
        );
    }
}
