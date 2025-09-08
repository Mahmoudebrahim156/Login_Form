package top;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import  javax.swing.JFrame;
import  javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Horay extends JPanel {
    public int x=1;
    Timer timer = new Timer(20, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                x+= 5;
                repaint();
            }
        });
                

Horay() {
    timer.start();
    JFrame frame = new JFrame("Horay");
    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frame.setSize(700, 100);
    frame.setLocation(280, 300);
    frame.setLayout(null);
    
    this.setBounds(0, 0, 700, 100);
    this.setLayout(null);
    this.setBackground(Color.BLACK);
    frame.add(this);

    frame.setVisible(true);
     }
    protected void paintComponent(Graphics g) {
       super.paintComponent(g);
        String Hola = "Hola, soy Dora";
        g.setFont(g.getFont().deriveFont(Font.ITALIC, 25));     
        g.setColor(Color.RED);
        g.drawString(Hola, x, 40);
       
    }

   
}