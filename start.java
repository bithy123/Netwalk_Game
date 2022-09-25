
package spl1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class start {
    static JButton b1,b2,b3;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Netwalk");
		frame.setResizable(false);
		frame.setVisible(true);
                frame.setBounds(550, 300, 600, 400);
                frame.setBackground(Color.PINK);
                JLabel l= new JLabel("Netwalk  Game");
                frame.add(l);
                frame.setLayout(null);
                l.setBounds(200, 20, 200, 70);
                l.setForeground(Color.BLUE);
                l.setFont(new Font("font size",Font.PLAIN,25));
                b1= new JButton("level_Easy");
                frame.add(b1);
                frame.setLayout(null);
                b1.setBounds(200, 100, 150, 50);
                 b1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae) {
                
                level_easy n = new level_easy();
                frame.dispose();
            
            }
         
            });
                b2= new JButton("level_Medium");
                frame.add(b2);
                frame.setLayout(null);
                b2.setBounds(200, 180, 150, 50);
                b2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae) {
                
                medium m = new medium();
                frame.dispose();
            }
         
            });
                
                b3= new JButton("level_Hard");
                frame.add(b3);
                frame.setLayout(null);
                b3.setBounds(200, 260, 150, 50);
                b3.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ae) {
                
                netwalk n = new netwalk();
                frame.dispose();
            
            }
         
            });
                
                
                
    }
    
}
