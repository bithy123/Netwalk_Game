package spl1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;



public class level_easy {
     int indicator=0,indicator2=0,indicator3=0,indicator4=0,indicator5=0,indicator6=0,
    indicator7=0,indicator8=0,indicator9=0,count=0;

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
     
              static  JTextField t,t2,t3,t4;
              JFrame frame;
   
     level_easy() {
                
                frame = new JFrame("Netwalk");
		frame.setResizable(true);
		frame.setVisible(true);
                frame.setBounds(0, 0, 250, 550);
                t= new JTextField();
                frame.add(t);
                frame.setLayout(null);
                
                /*frame.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e)
                {
                    System.exit(0);
                }
                        
                
                
                
                });*/
                t.setBounds(10, 280, 120, 30);
                 t.setFont(new Font("font size",Font.BOLD,20));
                t2= new JTextField();
                frame.add(t2);
                frame.setLayout(null);
                t2.setBounds(10, 400, 50, 30);
                t3= new JTextField();
                frame.add(t3);
                frame.setLayout(null);
                t3.setBounds(70, 400, 50, 30);
                t4= new JTextField();
                frame.add(t4);
                frame.setLayout(null);
                t4.setBounds(130, 400, 50, 30);
                
		Random r = new Random();
                
                indicator = r.nextInt(4);
                indicator2=r.nextInt(2);
                indicator3=r.nextInt(4);
                indicator4=r.nextInt(4);
                indicator5=r.nextInt(4);
                indicator6=r.nextInt(4);
                indicator7=r.nextInt(4);
                indicator8=r.nextInt(4);
                indicator9=r.nextInt(4);
                b1= new JButton();
                frame.add(b1);
                frame.setLayout(null);
                b1.setBounds(0, 0, 80, 80);
                
                setImg1();
        
            b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
            if(indicator==0){
            indicator++;
            count++;
             setImg1();
             t.setText(String.format("Moves: %d ", count));
             } 
                else if(indicator==1){
                    indicator++;
                    count++;
                     setImg1();
                     t.setText(String.format("Moves: %d ", count));
            
                }
            
            else if(indicator==2){
            indicator++;
            count++;
                setImg1();
                t.setText(String.format("Moves: %d", count));
            
                
            }
            
            else if(indicator==3){
           indicator=0;
           count++;
                setImg1();
                t.setText(String.format("Moves: %d ", count));
            
                
            } 
           check();
            }
         
            });
            b2 = new JButton();
                frame.add(b2);
                frame.setLayout(null);
                b2.setBounds(80, 0, 80, 80);
                setImg2();
                b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator2==0){
                  indicator2++;
                  count++;
                  setImg2();
                  t.setText(String.format("Moves: %d ", count));
        } 
            else if(indicator2==1){
            indicator2=0;
            count++;
            setImg2();
            t.setText(String.format("Moves: %d ", count));
        } 
            check();    

            }
         
            });
                b3 = new JButton();
                frame.add(b3);
                frame.setLayout(null);
                b3.setBounds(160, 0, 80, 80);
               setImg3();
                 b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator3==0){
            indicator3++;
            count++;
            setImg3();
            t.setText(String.format("Moves: %d ", count));
        } 
                else if(indicator3==1){
            
            indicator3++;
            count++;
            setImg3();
            t.setText(String.format("Moves: %d ", count));
                }
            
            else if(indicator3==2){
            
            indicator3++;
            count++;
            setImg3();
            t.setText(String.format("Moves: %d ", count));
                
            }
                 else if(indicator3==3){
            
            indicator3=0;
            count++;
            setImg3();
            t.setText(String.format("Moves: %d ", count));
                
            }
           check();
            }            
         
            });
                b4 = new JButton();
                frame.add(b4);
                frame.setLayout(null);
                b4.setBounds(0, 80, 80, 80);
                setImg4();
                 b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator4==0){
            
            indicator4++;
            count++;
            setImg4();
            t.setText(String.format("Moves: %d ", count));
        } 
                else if(indicator4==1){
           
            indicator4++;
            count++;
            setImg4();
            t.setText(String.format("Moves: %d ", count));
            
                }
            
            else if(indicator4==2){
            
            indicator4++;
            count++;
            setImg4();
            t.setText(String.format("Moves: %d ", count));
                
            }
                else if(indicator4==3){
           
            indicator4=0;
            count++;
            setImg4();
            t.setText(String.format("Moves: %d ", count));   
            }
           check();
            }            
         
            });
               b5 = new JButton();
                frame.add(b5);
                frame.setLayout(null);
                b5.setBounds(80, 80, 80, 80);
               setImg5();
                 b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator5==0){
           
            indicator5++;
            count++;
            setImg5();
            t.setText(String.format("Moves: %d ", count));
        } 
                else if(indicator5==1){
            
            indicator5++;
            count++;
            setImg5();
            t.setText(String.format("Moves: %d ", count));
                }
            
            else if(indicator5==2){
            
            indicator5++;
            count++;
            setImg5();
            t.setText(String.format("Moves: %d ", count));
                
            }
                else if(indicator5==3){
            
            indicator5=0;
            count++;
            setImg5();
            t.setText(String.format("Moves: %d ", count));
                
            } 
           check();
            }
            
         
            });
                b6 = new JButton();
                frame.add(b6);
                frame.setLayout(null);
                b6.setBounds(160, 80, 80, 80);
                setImg6();
                b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator6==0){
           
            indicator6++;
            count++;
            setImg6();
             t.setText(String.format("Moves: %d ", count));
        } 
                else if(indicator6==1){
           
            indicator6++;
            count++;
            setImg6();
             t.setText(String.format("Moves: %d ", count));
                }
            
            else if(indicator6==2){
           
            indicator6++;
            count++;
            setImg6();
            t.setText(String.format("Moves: %d ", count));
                
            }
                else if(indicator6==3){
            
            indicator6=0;
            count++;
            setImg6();
            t.setText(String.format("Moves: %d ", count));
            
            }
           check();
            }            
         
            });
                b7 = new JButton();
                frame.add(b7);
                frame.setLayout(null);
                b7.setBounds(0, 160, 80,80);
                setImg7();
                b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator7==0){
           
            indicator7++;
            count++;
            setImg7();
            t.setText(String.format("Moves: %d ", count));
        } 
                else if(indicator7==1){
            
            indicator7++;
            count++;
            setImg7();
            t.setText(String.format("Moves: %d ", count));
                }
            
            else if(indicator7==2){
           
            indicator7++;
            count++;
            setImg7();
            t.setText(String.format("Moves: %d ", count));
                
            }
                 else if(indicator7==3){
           
            indicator7=0;
            count++;
            setImg7();
            t.setText(String.format("Moves: %d ", count));
                
            }
           check();
            }            
         
            });
                b8 = new JButton();
                frame.add(b8);
                frame.setLayout(null);
                b8.setBounds(80, 160, 80, 80);
                setImg8();
                b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator8==0){
            
            indicator8++;
            count++;
            setImg8();
            t.setText(String.format("Moves: %d ", count));
        } 
                else if(indicator8==1){
            
            indicator8++;
            count++;
            setImg8();
            t.setText(String.format("Moves: %d ", count));
                }
            
            else if(indicator8==2){
           
            indicator8++;
            count++;
            setImg8();
            t.setText(String.format("Moves: %d ", count));
                
            }
                 else if(indicator8==3){
            
            indicator8=0;
            count++;
            setImg8();
            t.setText(String.format("Moves: %d ", count));    
            }
           check();
            }            
         
            });
                b9 = new JButton();
                frame.add(b9);
                frame.setLayout(null);
                b9.setBounds(160, 160, 80, 80);
                setImg9();
                b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator9==0){
            
            indicator9++;
            count++;
            setImg9();
            t.setText(String.format("Moves: %d ", count));
        } 
                else if(indicator9==1){
            
            indicator9++;
            count++;
            setImg9();
            t.setText(String.format("Moves: %d ", count));
                }
            
            else if(indicator9==2){
            
            indicator9++;
            count++;
            setImg9();
            t.setText(String.format("Moves: %d ", count));
                
            }
                else if(indicator9==3){
           
            indicator9=0;
            count++;
            setImg9();
            t.setText(String.format("Moves: %d ", count));
                
            }
           check();
            }            
         
            });
                
            
    }

       void setImg1() {
       if(indicator==0){
        b1.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffRight.png")));
         
       }
       else if(indicator==1){
           b1.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffTop.png")));
       }
         else if(indicator==2){
           b1.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeft.png")));
       }
         else{
           b1.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffBottom.png")));
       }
    }
     void setImg2() {
        if(indicator2==0){
            b2.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftRight.png")));
        }
        else if(indicator2==1){
            b2.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffBottomTop.png")));
        
    }
    
    }
    void setImg3() {
        if(indicator3==0){
            b3.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftBottom.png")));
        }
        else if(indicator3==1){
            b3.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffRightBottom.png")));
        }
        else if(indicator3==2){
            b3.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffRightTop.png")));
            
                }
            
            else {
            b3.setIcon(new ImageIcon(level_easy.class.getResource("/picture/OffLeftTop.png")));
            
                
            }
        
    }
     void setImg4() {
         if(indicator4==0){
            b4.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeft.png")));
            
                
            }
         else if(indicator4==1){
            b4.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffBottom.png")));
            
        } 
                else if(indicator4==2){
            b4.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffRight.png")));
            
                }
            
            else {
            b4.setIcon(new ImageIcon(level_easy.class.getResource("/picture/OffTop.png")));
           
                
            }
        
    }
      void setImg5() {
         if(indicator5==0){
            b5.setIcon(new ImageIcon(level_easy .class.getResource("/picture/ServerOnBottom.png")));
            
                
            } 
         else if(indicator5==1){
            b5.setIcon(new ImageIcon(level_easy .class.getResource("/picture/ServerOnRight.png")));
            
        } 
                else if(indicator5==2){
            b5.setIcon(new ImageIcon(level_easy .class.getResource("/picture/ServerOnTop.png")));
            
                }
            
            else {
            b5.setIcon(new ImageIcon(level_easy .class.getResource("/picture/ServerOnLeft.png")));
            
                
            }
                
           
        
    }
    void setImg6() {
         if(indicator6==0){
            b6.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffRightBottomTop.png")));
            
                
            }
         else if(indicator6==1){
            b6.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftRightTop.png")));
            
        } 
                else if(indicator6==2){
            b6.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftBottomTop.png")));
            
                }
            
            else {
            b6.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftRightBottom.png")));
            
                
            }
                
           
        
    }
     void setImg7() {
         if(indicator7==0){
            b7.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeft.png")));
            
                
            }
        else if(indicator7==1){
            b7.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffBottom.png")));
            
        } 
                else if(indicator7==2){
            b7.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffRight.png")));
            
                }
            
            else {
            b7.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffTop.png")));
            
                
            }
                 
        
    }
     void setImg8() {
           if(indicator8==0){
            b8.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffRightTop.png")));
            
                
            }
           else if(indicator8==1){
            b8.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftTop.png")));
            
        } 
                else if(indicator8==2){
            b8.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftBottom.png")));
            
                }
            
            else {
            b8.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffRightBottom.png")));
            
                
            }
                 
        
    }
     void setImg9() {
         if(indicator9==0){
            b9.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftRightTop.png")));
            
                
            }
       else if(indicator9==1){
            b9.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftBottomTop.png")));
           
        } 
                else if(indicator9==2){
            b9.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffLeftRightBottom.png")));
            
                }
            
            else {
            b9.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OffRightBottomTop.png")));
            
                
            }
         
        
    }
    
   public void check()
    {
        if(indicator==0&&indicator2==0&&indicator3==0&&indicator4==0&&indicator5==0&&indicator6==0&&
                indicator7==0&&indicator8==0&&indicator9==0)
        {
            b1.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OnRight.png")));
            b2.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OnLeftRight.png")));
            b3.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OnLeftBottom.png")));
             b4.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OnLeft.png")));
             b5.setIcon(new ImageIcon(level_easy .class.getResource("/picture/ServerOnBottom.png")));
              b6.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OnRightBottomTop.png")));
              b7.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OnLeft.png")));
              b8.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OnRightTop.png")));
              b9.setIcon(new ImageIcon(level_easy .class.getResource("/picture/OnLeftRightTop.png")));
              
           int p=JOptionPane.showConfirmDialog(null, "You win\nplay again??","",JOptionPane.YES_NO_OPTION);
            
           if(p==JOptionPane.YES_OPTION)
            {
                frame.dispose();
                level_easy f= new level_easy();
                
            }
           else
           {
               frame.dispose();
           }
            
        }
       
    }

    
}
