
package spl1;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;




public class medium {
     int indicator=0,indicator2=0,indicator3=0,indicator4=0,indicator5=0,indicator6=0,indicator7=0,indicator8=0,indicator9=0,indicator10=0,indicator11=0,
            indicator12=0,indicator13=0,indicator14=0,indicator15=0,indicator16=0;
      JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
     int count=0;
     JTextField t;
    JFrame frame;
    medium(){
         frame = new JFrame("Netwalk");
		

		frame.setResizable(false);
		frame.setVisible(true);
                frame.setBounds(550, 200, 330, 500);
                t= new JTextField();
                frame.add(t);
                frame.setLayout(null);
                t.setBounds(10, 370, 120, 30);
                 t.setFont(new Font("font size",Font.BOLD,20));
                
                Random r = new Random();
                
                indicator = r.nextInt(4);
                indicator2=r.nextInt(2);
                indicator3=r.nextInt(4);
                indicator4=r.nextInt(4);
                indicator5=r.nextInt(2);
                indicator6=r.nextInt(4);
                indicator7=r.nextInt(4);
                indicator8=r.nextInt(4);
                indicator9=r.nextInt(2);
                indicator10 = r.nextInt(4);
                indicator12=r.nextInt(4);
                indicator13=r.nextInt(4);
                indicator14=r.nextInt(4);
                indicator15=r.nextInt(4);
                indicator16=r.nextInt(4);
                
                b1 = new JButton();
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
            t.setText(String.format("Moves: %d ", count));
            setImg1();
        } 
                else if(indicator==1){
            
            indicator++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg1();
                }
            
            else if(indicator==2){
           
            indicator++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg1();
                
            }
                else if(indicator==3){
           
            indicator=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg1();
                
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
            t.setText(String.format("Moves: %d ", count));
            setImg2();
        } 
            else if(indicator2==1){
           
            indicator2=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg2();
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
            t.setText(String.format("Moves: %d ", count));
             setImg3();
        } 
                else if(indicator3==1){
            
            indicator3++;
            count++;
            t.setText(String.format("Moves: %d ", count));
             setImg3();
                }
            
            else if(indicator3==2){
            
            indicator3++;
            count++;
            t.setText(String.format("Moves: %d ", count));
             setImg3();
                
            }
                 else if(indicator3==3){
            
            indicator3=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
             setImg3();
                
            }
           check();
            }            
         
            });
                b4 = new JButton();
                frame.add(b4);
                frame.setLayout(null);
                b4.setBounds(240, 0, 80, 80);
                 setImg4();
                b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator4==0){
            
            indicator4++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg4();
        } 
                else if(indicator4==1){
            
            indicator4++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg4();
                }
            
            else if(indicator4==2){
            
            indicator4++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg4();
                
            }
                else if(indicator4==3){
            
            indicator4=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg4();
                
            }
           check();
            }            
         
            });
                b5 = new JButton();
                frame.add(b5);
                frame.setLayout(null);
                b5.setBounds(0, 80, 80, 80);
                setImg5();
                b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator5==0){
            
            indicator5++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg5();
        } 
                
              else if(indicator5==1){
            
            indicator5=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg5();
                
            } 
             
           check();
            }            
         
            });
                b6= new JButton();
                frame.add(b6);
                frame.setLayout(null);
                b6.setBounds(80, 80, 80, 80);
               setImg6();
                b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator6==0){
            
            indicator6++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg6();
        } 
                else if(indicator6==1){
            
            indicator6++;count++;
            t.setText(String.format("Moves: %d ", count));
            setImg6();
                }
            
            else if(indicator6==2){
            
            indicator6++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg6();
                
            }
                 else if(indicator6==3){
            
            indicator6=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg6();
                
            }
           check();
            }            
         
            });
                
                b7 = new JButton();
                frame.add(b7);
                frame.setLayout(null);
                b7.setBounds(160, 80, 80, 80);
                setImg7();
                b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator7==0){
            
            indicator7++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg7();
        } 
                else if(indicator7==1){
            
            indicator7++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg7();
                }
            
            else if(indicator7==2){
            
            indicator7++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg7();
                
            }
                else if(indicator7==3){
            
            indicator7=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg7();
                
            }
           check();
            }            
         
            });
                b8 = new JButton();
                frame.add(b8);
                frame.setLayout(null);
                b8.setBounds(240, 80, 80, 80);
                setImg8();
                b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator8==0){
            
            indicator8++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg8();
        } 
                else if(indicator8==1){
            
            indicator8++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg8();
                }
            
            else if(indicator8==2){
            
            indicator8++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg8();
                
            }
                else if(indicator8==3){
           
            indicator8=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
                setImg8();
            }
           check();
            }            
         
            });
                
                b9 = new JButton();
                frame.add(b9);
                frame.setLayout(null);
                b9.setBounds(0, 160, 80, 80);
                setImg9();
                b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator9==0){
            
            indicator9++;
            count++;
            t.setText(String.format("Moves: %d :", count));
            setImg9();
        } 
                
                else if(indicator9==1){
            
            indicator9=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg9();
                
            }
           check();
            }            
         
            });
                
                b10 = new JButton();
                frame.add(b10);
                frame.setLayout(null);
                b10.setBounds(80, 160, 80, 80);
                setImg10();
                b10.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator10==0){
            
            indicator10++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg10();
        } 
                else if(indicator10==1){
            
            indicator10++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg10();
        } 
                else if(indicator10==2){
            
            indicator10++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg10();
        } 
                else if(indicator10==3){
            
            indicator10=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg10();
        } 
           check();     
           
            }            
         
            });
                
                b11 = new JButton();
                frame.add(b11);
                frame.setLayout(null);
                b11.setBounds(160, 160, 80, 80);
                setImg11();
                b11.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator11==0){
            
            indicator11++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg11();
        } 
                else if(indicator11==1){
           
            indicator11++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg11();
                }
            
            else if(indicator11==2){
            
            indicator11++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg11();
                
            }
                else if(indicator11==3){
            
            indicator11=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg11();
                
            }
           check();
            }            
         
            });
                 
                b12 = new JButton();
                frame.add(b12);
                frame.setLayout(null);
                b12.setBounds(240, 160, 80, 80);
                setImg12();
                b12.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator12==0){
            
            indicator12++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg12();
        } 
                else if(indicator12==1){
            
            indicator12++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg12();
                }
            
            else if(indicator12==2){
           
            indicator12++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg12();
                
            }
                 else if(indicator12==3){
            
            indicator12=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg12();
                
            }
           check();
            }            
         
            });
                 
                b13 = new JButton();
                frame.add(b13);
                frame.setLayout(null);
                b13.setBounds(0, 240, 80, 80);
                setImg13();
                b13.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator13==0){
            
            indicator13++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg13();
        } 
                else if(indicator13==1){
            
            indicator13++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg13();
                }
            
            else if(indicator13==2){
           
            indicator13++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg13();
                
            }
                else if(indicator13==3){
            
            indicator13=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg13();
                
            }
           check();
            }            
         
            });
                 
                b14 = new JButton();
                frame.add(b14);
                frame.setLayout(null);
                b14.setBounds(80, 240, 80, 80);
                setImg14();
                b14.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator14==0){
            
            indicator14++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg14();
        } 
                else if(indicator14==1){
            
            indicator14++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg14();
                }
            
            else if(indicator14==2){
            
            indicator14++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg14();
                
            }
                 else if(indicator14==3){
            
            indicator14=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg14();
                
            }
           check();
            }            
         
            });
                
                b15 = new JButton();
                frame.add(b15);
                frame.setLayout(null);
                b15.setBounds(160, 240, 80, 80);
                setImg15();
                b15.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator15==0){
            
            indicator15++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg15();
        } 
                else if(indicator15==1){
           
            indicator15++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg15();
                }
            
            else if(indicator15==2){
            
            indicator15++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg15();
                
            }
                else if(indicator15==3){
           
            indicator15=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg15();
                
            }
           check();
            }            
         
            });
                 
                b16 = new JButton();
                frame.add(b16);
                frame.setLayout(null);
                b16.setBounds(240, 240, 80, 80);
                setImg16();
                b16.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator16==0){
            
            indicator16++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg16();
        } 
                else if(indicator16==1){
            
            indicator16++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg16();
                }
            
            else if(indicator16==2){
            
            indicator16++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg16();
                
            }
                 else if(indicator16==3){
           
            indicator16=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg16();
                
            }
           check();
            }            
         
            });
    }
                
         void setImg1() {
         if(indicator==0){
        b1.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
        
       }
       else if(indicator==1){
           b1.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
       }
         else if(indicator==2){
           b1.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
       }
         else{
           b1.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
       }
     }
     void setImg2() {
        if(indicator2==0){
            b2.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRight.png")));
           
        } 
         else if(indicator2==1){
            b2.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottomTop.png")));
           
        }    
    }
     void setImg3() {
        if(indicator3==0){
            b3.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
        }
        else if(indicator3==1){
            b3.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
        }
        else if(indicator3==2){
            b3.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            
                }
            
            else {
            b3.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
                
            }
        
    }
     void setImg4()
     {
         if(indicator4==0){
            b4.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
        } 
                else if(indicator4==1){
            b4.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
           
                }
            
            else if(indicator4==2){
            b4.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
           
                
            }
                else if(indicator4==3){
            b4.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            
                
            }
     }
     void setImg5()
     {
         if(indicator5==0){
        b5.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottomTop.png")));
        
       }
       
         else{
           b5.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRight.png")));
       }
         
     }
      void setImg6()
     {
     if(indicator6==0){
            b6.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
     }
                else if(indicator6==1){
            b6.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
                }
            
            else if(indicator6==2){
            b6.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
           
                
            }
                else if(indicator6==3){
            b6.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            
                
            }
     }
     void setImg7()
     {
         if(indicator7==0){
            b7.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            
        } 
                else if(indicator7==1){
            b7.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
           
                }
            
            else if(indicator7==2){
            b7.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            
                
            }
                else if(indicator7==3){
            b7.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            
                
            }
     }
    void setImg8()
     {
         if(indicator8==0){
            b8.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
        } 
                else if(indicator8==1){
            b8.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
                }
            
            else if(indicator8==2){
            b8.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            
                
            }
                else if(indicator8==3){
            b8.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
                
            }
     }
    void setImg9()
     {
         if(indicator9==0){
            b9.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottomTop.png")));
            
        } 
                
                else if(indicator9==1){
            b9.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRight.png")));
            
                
            }
     }
     void setImg10()
     {
          if(indicator10==0){
            b10.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
           
        } 
         else if(indicator10==1){
            b10.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
           
        } 
          else if(indicator10==2){
            b10.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
           
        } 
          else if(indicator10==3){
            b10.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
           
        } 
     }
   void setImg11()
     {
         if(indicator11==0){
            b11.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
            
        } 
                else if(indicator11==1){
            b11.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            
                }
            
            else if(indicator11==2){
            b11.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
      
                
            }
                else if(indicator11==3){
            b11.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            
                
            }
     }
     void setImg12()
     {
         if(indicator12==0){
            b12.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            
        } 
                else if(indicator12==1){
            b12.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
                }
            
            else if(indicator12==2){
            b12.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
                
            }
                 else if(indicator12==3){
            b12.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
                
            }
     }
      void setImg13()
     {
         if(indicator13==0){
            b13.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            
        } 
                else if(indicator13==1){
            b13.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            
                }
            
            else if(indicator13==2){
            b13.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
            
                
            }
                else if(indicator13==3){
            b13.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
           
                
            }
     }
      void setImg14()
     {
         if(indicator14==0){
            b14.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
        } 
                else if(indicator14==1){
            b14.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
           
                }
            
            else if(indicator14==2){
            b14.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
                
            }
                 else if(indicator14==3){
            b14.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
                
            }
     }
      void setImg15()
     {
          
                if(indicator15==0){
            b15.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            
        } 
                else if(indicator15==1){
            b15.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            
                }
            
            else if(indicator15==2){
            b15.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
            
                
            }
                else if(indicator15==3){
            b15.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            
                
            }
     }
     void setImg16()
     {
         if(indicator16==0){
            b16.setIcon(new ImageIcon(netwalk.class.getResource("/picture/ServerOnLeftBottomTop.png")));
            
        } 
                else if(indicator16==1){
            b16.setIcon(new ImageIcon(netwalk.class.getResource("/picture/ServerOnLeftRightBottom.png")));
            
                }
            
            else if(indicator16==2){
            b16.setIcon(new ImageIcon(netwalk.class.getResource("/picture/ServerOnRightBottomTop.png")));
            
                
            }
                 else if(indicator16==3){
            b16.setIcon(new ImageIcon(netwalk.class.getResource("/picture/ServerOnLeftRightTop.png")));
            
                
            }
     }
      void check()
    {
         if(indicator==0&&indicator2==0&&indicator3==0&&indicator4==0&&indicator5==0&&indicator6==0&&
         indicator7==0&&indicator8==0&&indicator9==0&&indicator10==0&&indicator11==0&&indicator12==0&&
                 indicator13==0&&indicator14==0&&indicator15==0&&indicator16==0)
         {
             b1.setIcon(new ImageIcon(medium.class.getResource("/picture/OnRightBottom.png")));
            b2.setIcon(new ImageIcon(medium.class.getResource("/picture/OnLeftRight.png")));
            b3.setIcon(new ImageIcon(medium.class.getResource("/picture/OnLeftRightBotTom.png")));
             b4.setIcon(new ImageIcon(medium.class.getResource("/picture/OnLeftBottomTop.png")));
             b5.setIcon(new ImageIcon(medium.class.getResource("/picture/OnBottomTop.png")));
              b6.setIcon(new ImageIcon(medium.class.getResource("/picture/OnRight.png")));
              b7.setIcon(new ImageIcon(medium.class.getResource("/picture/OnLeftTop.png")));
              b8.setIcon(new ImageIcon(medium.class.getResource("/picture/OnTop.png")));
              b9.setIcon(new ImageIcon(medium.class.getResource("/picture/OnBottomTop.png")));
              b10.setIcon(new ImageIcon(medium.class.getResource("/picture/OnRight.png")));
              b11.setIcon(new ImageIcon(medium.class.getResource("/picture/OnLeftBottom.png")));
            b12.setIcon(new ImageIcon(medium.class.getResource("/picture/OnBottom.png")));
            b13.setIcon(new ImageIcon(medium.class.getResource("/picture/OnRightTop.png")));
             b14.setIcon(new ImageIcon(medium.class.getResource("/picture/OnLeft.png")));
             b15.setIcon(new ImageIcon(medium.class.getResource("/picture/OnRightTop.png")));
              b16.setIcon(new ImageIcon(medium.class.getResource("/picture/OnLeftBottomTop.png")));
              
              int p=JOptionPane.showConfirmDialog(null, "You win\nplay again??","",JOptionPane.YES_NO_OPTION);
            if(p==JOptionPane.YES_OPTION)
            {
                frame.dispose();
                medium m= new medium();
                
            }
            else
            {
                 frame.dispose();
            }
         }
                         
    }
    
}
