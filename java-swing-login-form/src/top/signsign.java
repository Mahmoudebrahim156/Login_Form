package top;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class signsign {
    signsign() {
     
        JFrame frame = new JFrame("Sign Up");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocation(450, 250);
        frame.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 400);
        panel.setLayout(null);
        frame.add(panel);

        JLabel entery = new JLabel("Enter your username and password:");
        entery.setBounds(10, 10, 300, 50);
        panel.add(entery);

        JLabel usernameL = new JLabel("Username:");
        usernameL.setBounds(10, 60, 70, 50);
        panel.add(usernameL);

        JTextField usernameF = new JTextField();
        usernameF.setBounds(120, 80, 120, 20);
        panel.add(usernameF);

        JLabel passwordL = new JLabel("Password:");
        passwordL.setBounds(10, 120, 70, 50);
        panel.add(passwordL);

        JPasswordField passwordF = new JPasswordField();
        passwordF.setBounds(120, 140, 120, 20);
        panel.add(passwordF);

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(120, 200, 100, 30);
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameF.getText();
                String password = new String(passwordF.getPassword());
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
                } 
                else if (loglog.user.containsKey(username))
			{
				JOptionPane.showMessageDialog(frame, "Username already exists");
			}
                else {
                    loglog.user.put(username, password);
                    frame.dispose();
                    JOptionPane.showMessageDialog(frame, "Sign up successful!");
                }
            }
        });
        panel.add(signUpButton);
        frame.setVisible(true);
    }
    
}