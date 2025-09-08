package top;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
public class App {
    App(){
        JFrame frame = new JFrame("losi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocation(400, 200);
        frame.setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 500, 400);
        frame.add(panel);

        JLabel label = new JLabel("Welcome");
        label.setBounds(200, 100, 100, 20);
        label.setFont(new Font("Arial", Font.ITALIC, 20));
        panel.add(label);

        JLabel label2 = new JLabel("Please choose either to login or sign up");
        label2.setBounds(130, 130, 300, 20);
        panel.add(label2);

        JButton sign = new JButton("Sign up");
        sign.setBounds(150, 200, 80, 30);
        sign.addActionListener( new ActionListener() 
        {
            public void actionPerformed (ActionEvent e)
            {
            	new signsign(); 
            }
        });
        panel.add(sign);
        
        JButton log = new JButton("Login");
        log.setBounds(250, 200, 80, 30);
        log.addActionListener( new ActionListener() 
        {
            public void actionPerformed (ActionEvent e)
            { 
            	 new loglog();               	
            }
        });
        panel.add(log);

        JPopupMenu menu = new JPopupMenu();
                JMenu colorMenu = new JMenu("change background color to");
                JMenuItem defItem = new JMenuItem("Default");
                defItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        panel.setBackground(null);
                    }
                });
                JMenuItem redItem = new JMenuItem("Red");
                redItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        panel.setBackground(Color.RED);
                    }
                });
                JMenuItem greenItem = new JMenuItem("Green");
                greenItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        panel.setBackground(Color.GREEN);
                    }
                });
                JMenuItem blueItem = new JMenuItem("Blue");
                blueItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        panel.setBackground(Color.BLUE);
                    }
                });
                JMenuItem yellowItem = new JMenuItem("Yellow");
                yellowItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        panel.setBackground(Color.YELLOW);
                    }
                });
                JMenuItem pinkItem = new JMenuItem("Pink");
                pinkItem.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        panel.setBackground(Color.PINK);
                    }    
        });
                colorMenu.add(defItem);
                colorMenu.add(redItem);
                colorMenu.add(greenItem);
                colorMenu.add(blueItem);
                colorMenu.add(yellowItem);
                colorMenu.add(pinkItem);
                menu.add(colorMenu);
                panel.setComponentPopupMenu(menu);
        
        

        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App();
    }
}
