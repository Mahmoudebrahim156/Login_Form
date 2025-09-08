package top;
import java.util.HashMap;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loglog {
    public static HashMap<String, String> user = new HashMap<String, String>();
    static {
        user.put("Loay", "123");
        user.put("Mahmoud", "1234");
        user.put("Momen", "12345");
    }
    
    public loglog() {
    
        JFrame frame = new JFrame("Login");
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

        JButton loginB = new JButton("Login");
        loginB.setBounds(120, 200, 100, 30);
        loginB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameF.getText();
                String password = new String(passwordF.getPassword());
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields.");
                } 
                else if (user.containsKey(username) && user.get(username).equals(password)) {
                   frame.dispose(); 
                   new Horay();
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        });
        panel.add(loginB);

        frame.setVisible(true);
    }
    

}

