package Estudo;
import javax.swing.*;

public class LoginProgram extends JFrame {
    private JLabel labelUsername, labelPassword, labelImage;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;
    private JButton buttonOK;

    public LoginProgram() {
        setTitle("Login Program");
        setSize(550, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("ifmt.png"));
        labelImage = new JLabel(imageIcon);
        labelImage.setBounds(10, 10, 150, 150);
        add(labelImage);

        labelUsername = new JLabel("Username:");
        labelUsername.setBounds(180, 20, 80, 25);
        add(labelUsername);

        textFieldUsername = new JTextField();
        textFieldUsername.setBounds(260, 20, 150, 25);
        add(textFieldUsername);

        labelPassword = new JLabel("Password:");
        labelPassword.setBounds(180, 50, 80, 25);
        add(labelPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(260, 50, 150, 25);
        add(passwordField);

        buttonOK = new JButton("OK");
        buttonOK.setBounds(260, 80, 80, 25);
        buttonOK.addActionListener(e -> {
            String username = textFieldUsername.getText();
            String password = new String(passwordField.getPassword());

            JOptionPane.showMessageDialog(LoginProgram.this,
                    "Username: " + username + "\nPassword: " + password,
                    "Login Information",
                    JOptionPane.INFORMATION_MESSAGE);
        });
        add(buttonOK);

        setVisible(true);
    }}



    
