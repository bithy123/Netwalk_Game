
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



public class netwalk {
     int indicator=0,indicator2=0,indicator3=0,indicator4=0,indicator5=0,indicator6=0,indicator7=0,indicator8=0,indicator9=0,indicator10=0,indicator11=0,
            indicator12=0,indicator13=0,indicator14=0,indicator15=0,indicator16=0,indicator17=0,indicator18=0,indicator19=0,indicator20=0,indicator21=0,indicator22=0,indicator23=0,
            indicator24=0,indicator25=0,indicator26=0,indicator27=0,indicator28=0,indicator29=0,indicator30=0,indicator31=0,indicator32=0,indicator33=0,indicator34=0,
            indicator35=0,indicator36=0,indicator37=0,indicator38=0,indicator39=0,indicator40=0,indicator41=0,indicator42=0,indicator43=0,indicator44=0,indicator45=0,
            indicator46=0,indicator47=0,indicator48=0,indicator49=0;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,
            b21,b22,b23,b24,b25,b26,b27,b28,b29,b31,b32,b33,b34,b35,b36,b37,b38,b39,b30,b40,b41,
            b42,b43,b44,b45,b46,b47,b48,b49;
     int count=0;
     JTextField t;
     JFrame frame;
    netwalk() {
        
         frame = new JFrame("Netwalk");
		

		frame.setResizable(false);
		frame.setVisible(true);
                frame.setBounds(550, 200, 570, 700);
                t= new JTextField();
                frame.add(t);
                frame.setLayout(null);
                t.setBounds(10, 600, 120, 30);
                t.setFont(new Font("font size",Font.BOLD,25));
                
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
                indicator10 = r.nextInt(2);
                indicator12=r.nextInt(4);
                indicator13=r.nextInt(4);
                indicator14=r.nextInt(4);
                indicator15=r.nextInt(4);
                indicator16=r.nextInt(4);
                indicator17=r.nextInt(4);
                indicator18=r.nextInt(4);
                indicator19=r.nextInt(4);
                indicator20 = r.nextInt(2);
                indicator21=r.nextInt(2);
                indicator22=r.nextInt(4);
                indicator23=r.nextInt(4);
                indicator24=r.nextInt(4);
                indicator25=r.nextInt(4);
                indicator26=r.nextInt(4);
                indicator27=r.nextInt(4);
                indicator28=r.nextInt(4);
                indicator29=r.nextInt(4);
                indicator30 = r.nextInt(4);
                indicator31=r.nextInt(4);
                indicator32=r.nextInt(4);
                indicator33=r.nextInt(4);
                indicator34=r.nextInt(4);
                indicator35=r.nextInt(4);
                indicator36=r.nextInt(4);
                indicator37=r.nextInt(4);
                indicator38=r.nextInt(4);
                indicator39=r.nextInt(4);
                indicator40 = r.nextInt(4);
                indicator41=r.nextInt(2);
                indicator42=r.nextInt(4);
                indicator43=r.nextInt(2);
                indicator44=r.nextInt(4);
                indicator45=r.nextInt(4);
                indicator46=r.nextInt(4);
                indicator47=r.nextInt(4);
                indicator48=r.nextInt(4);
                indicator49=r.nextInt(4);
                
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
                b5.setBounds(320, 0, 80, 80);
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
            
            indicator5++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg5();
                }
            
            else if(indicator5==2){
            
            indicator5++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg5();
                
            }
              else if(indicator5==3){
            
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
                b6.setBounds(400, 0, 80, 80);
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
                b7.setBounds(480, 0, 80, 80);
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
            t.setText(String.format("Moves: %d", count));
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
                b8.setBounds(0, 80, 80, 80);
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
                b9.setBounds(80, 80, 80, 80);
                setImg9();
                b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator9==0){
            
            indicator9++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg9();
        } 
                else if(indicator9==1){
           
            indicator9++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg9();
                }
            
            else if(indicator9==2){
            
            indicator9++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg9();
                
            }
                else if(indicator9==3){
            
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
                b10.setBounds(160, 80, 80, 80);
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
                b11.setBounds(240, 80, 80, 80);
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
                b12.setBounds(320, 80, 80, 80);
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
                b13.setBounds(400, 80, 80, 80);
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
                b14.setBounds(480, 80, 80, 80);
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
                b15.setBounds(0, 160, 80, 80);
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
                b16.setBounds(80, 160, 80, 80);
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
                 
                b17 = new JButton();
                frame.add(b17);
                frame.setLayout(null);
                b17.setBounds(160, 160, 80, 80);
                setImg17();
                b17.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator17==0){
            
            indicator17++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg17();
        } 
                else if(indicator17==1){
            
            indicator17++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg17();
                }
            
            else if(indicator17==2){
            
            indicator17++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg17();           
                
            }
                 else if(indicator17==3){
            
            indicator17=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg17();
                
            }
           check();
            }            
         
            });
                 
                 b18 = new JButton();
                frame.add(b18);
                frame.setLayout(null);
                b18.setBounds(240, 160,80, 80);
                setImg18();
                b18.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator18==0){
            
            indicator18++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg18();
        } 
                else if(indicator18==1){
            
            indicator18++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg18();
                }
            
            else if(indicator18==2){
            
            indicator18++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg18();
                
            }
                else if(indicator18==3){
            
            indicator18=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg18();
                
            }
           check();
            }            
         
            });
                 
                b19 = new JButton();
                frame.add(b19);
                frame.setLayout(null);
                b19.setBounds(320, 160, 80, 80);
                setImg19();
                b19.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator19==0){
            
            indicator19++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg19();
        } 
                else if(indicator19==1){
            
            indicator19++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg19();
                }
            
            else if(indicator19==2){
            
            indicator19++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg19();
                
            }
                else if(indicator19==3){
           
            indicator19=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg19();
                
            }
           check();
            }            
         
            });
                 
                 b20 = new JButton();
                frame.add(b20);
                frame.setLayout(null);
                b20.setBounds(400, 160, 80, 80);
                setImg20();
                b20.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator20==0){
            
            indicator20++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg20();
        } 
              else if(indicator20==1){
            
            indicator20=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg20();
        } 
                
           check();
            }            
         
            });
                 
                b21 = new JButton();
                frame.add(b21);
                frame.setLayout(null);
                b21.setBounds(480, 160, 80, 80);
                setImg21();
                b21.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator21==0){
            
            indicator21++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg21();
        } 
         else if(indicator21==1){
            
            indicator21=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg21();
        }       
                
           check();
            }            
         
            });
                
                 b22 = new JButton();
                frame.add(b22);
                frame.setLayout(null);
                b22.setBounds(0, 240, 80, 80);
                setImg22();
                b22.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator22==0){
            
            indicator22++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg22();
        } 
                else if(indicator22==1){
            
            indicator22++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg22();
                }
            
            else if(indicator22==2){
            
            indicator22++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg22();
                
            }
                else if(indicator22==3){
            
            indicator22=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg22();
                
            }
           check();
            }            
         
            });
                
                b23 = new JButton();
                frame.add(b23);
                frame.setLayout(null);
                b23.setBounds(80, 240, 80, 80);
                setImg23();
                b23.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator23==0){
            
            indicator23++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg23();
        } 
                else if(indicator23==1){
           
            indicator23++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg23();
                }
            
            else if(indicator23==2){
           
            indicator23++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg23();
                
            }
                else if(indicator23==3){
            
            indicator23=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg23();
                
            }
           check();
            }            
         
            });
                
                b24 = new JButton();
                frame.add(b24);
                frame.setLayout(null);
                b24.setBounds(160, 240, 80, 80);
                setImg24();
                b24.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator24==0){
           
            indicator24++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg24();
        } 
                else if(indicator24==1){
            
            indicator24++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg24();
                }
            
            else if(indicator24==2){
           
            indicator24++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg24();
                
            }
                else if(indicator24==3){
            
            indicator24=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg24();
                
            }
           check();
            }            
         
            });
                
                
                b25 = new JButton();
                frame.add(b25);
                frame.setLayout(null);
                b25.setBounds(240, 240, 80, 80);
                setImg25();
                b25.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator25==0){
           
            indicator25++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg25();
        } 
                else if(indicator25==1){
            
            indicator25++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg25();
                }
            
            else if(indicator25==2){
            
            indicator25++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg25();;
                
            }
                else if(indicator25==3){
            
            indicator25=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg25();
                
            }
           check();
            }            
         
            });
                
                
                b26 = new JButton();
                frame.add(b26);
                frame.setLayout(null);
                b26.setBounds(320, 240, 80, 80);
               setImg26();
                b26.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator26==0){
            
            indicator26++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg26();
        } 
                else if(indicator26==1){
            
            indicator26++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg26();
                }
            
            else if(indicator26==2){
          
            indicator26++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg26();
                
            }
                else if(indicator26==3){
            
            indicator26=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg26();
                
            }
           check();
            }            
         
            });
                
                
                 b27 = new JButton();
                frame.add(b27);
                frame.setLayout(null);
                b27.setBounds(400, 240, 80, 80);
                setImg27();
                b27.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator27==0){
            
            indicator27++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg27();
        } 
                else if(indicator27==1){
            
            indicator27++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg27();
                }
            
            else if(indicator27==2){
            
            indicator27++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg27();
                
            }
                else if(indicator27==3){
            
            indicator27=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg27();
                
            }
           check();
            }            
         
            });
                
                
                b28 = new JButton();
                frame.add(b28);
                frame.setLayout(null);
                b28.setBounds(480, 240, 80, 80);
                setImg28();
                b28.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator28==0){
            
            indicator28++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg28();
        } 
                else if(indicator28==1){
            
            indicator28++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg28();
                }
            
            else if(indicator28==2){
           
            indicator28++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg28();
                
            }
             else if(indicator28==3){
            
            indicator28=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg28();
                
            }   
           check();
            }            
         
            });
                
                
                b29 = new JButton();
                frame.add(b29);
                frame.setLayout(null);
                b29.setBounds(0, 320, 80, 80);
                setImg29();
                b29.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator29==0){
            
            indicator29++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg29();
        } 
                else if(indicator29==1){
            
            indicator29++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg29();
                }
            
            else if(indicator29==2){
           
            indicator29++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg29();
                
            }
                else if(indicator29==3){
            
            indicator29=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg29();
                
            }
           check();
            }            
         
            });
                
                b30 = new JButton();
                frame.add(b30);
                frame.setLayout(null);
                b30.setBounds(80, 320, 80, 80);
                setImg30();
                b30.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator30==0){
            
            indicator30++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg30();
        } 
                else if(indicator30==1){
            
            indicator30++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg30();
                }
            
            else if(indicator30==2){
            
            indicator30++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg30();
                
            }
                else if(indicator30==3){
           
            indicator30=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg30();
                
            }
           check();
            }            
         
            });
                
                b31 = new JButton();
                frame.add(b31);
                frame.setLayout(null);
                b31.setBounds(160, 320, 80, 80);
                setImg31();
                b31.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator31==0){
            
            indicator31++;
            count++;
            t.setText(String.format("Moves: %d", count));
            setImg31();
        } 
                else if(indicator31==1){
            
            indicator31++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg31();
                }
            
            else if(indicator31==2){
            
            indicator31++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg31();
                
            }
                else if(indicator31==3){
            
            indicator31=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
             setImg31();   
            }
          check(); 
            }            
         
            });
                
                b32 = new JButton();
                frame.add(b32);
                frame.setLayout(null);
                b32.setBounds(240, 320, 80, 80);
                setImg32();
                b32.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator32==0){
           
            indicator32++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg32();
        } 
                else if(indicator32==1){
            
            indicator32++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg32();
                }
            
            else if(indicator32==2){
            
            indicator32++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg32();
                
            }
                else if(indicator32==3){
            
            indicator32=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg32();
                
            }
           check();
            }            
         
            });
                 b33 = new JButton();
                frame.add(b33);
                frame.setLayout(null);
                b33.setBounds(320, 320, 80, 80);
                setImg33();
                b33.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(indicator33==0){
            indicator33++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg33();
        } 
                else if(indicator33==1){
            indicator33++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg33();
                }
            
            else if(indicator33==2){
            indicator33++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg33();
                
            }
            else if(indicator33==3){
            indicator33=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg33();    
            }
           check();
            }            
         
            });
                b34 = new JButton();
                frame.add(b34);
                frame.setLayout(null);
                b34.setBounds(400, 320, 80, 80);
                setImg34();
                b34.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator34==0){
            indicator34++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg34();
        } 
                else if(indicator34==1){
            indicator34++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg34();
                }
            
            else if(indicator34==2){
            indicator34++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg34();
                
            }
                else if(indicator34==3){
            indicator34=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg34();
                
            }
          check(); 
            }            
         
            });
                b35 = new JButton();
                frame.add(b35);
                frame.setLayout(null);
                b35.setBounds(480, 320, 80, 80);
                setImg35();
                b35.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator35==0){
            indicator35++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg35();
        } 
                else if(indicator35==1){
             indicator35++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg35();
                }
            
            else if(indicator35==2){
            indicator35++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg35();
                
            }
           else if(indicator35==3){
           indicator35=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg35();
                
            }
                check();
            }            
         
            });
                b36 = new JButton();
                frame.add(b36);
                frame.setLayout(null);
                b36.setBounds(0,400, 80, 80);
                setImg36();
                b36.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator36==0){
            indicator36++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg36();
        } 
                else if(indicator36==1){
           indicator36++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg36();
                }
            
            else if(indicator36==2){
            indicator36++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg36();
             }
           else if(indicator36==3){
             indicator36=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
             setImg36();   
            }
                check();
            }            
         
            });
                b37 = new JButton();
                frame.add(b37);
                frame.setLayout(null);
                b37.setBounds(80, 400, 80, 80);
                setImg37();
                b37.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator37==0){
            indicator37++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg37();
        } 
                else if(indicator37==1){
            indicator37++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg37();
                }
            
            else if(indicator37==2){
            indicator37++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg37();
                
            }
            else if(indicator37==3){
            indicator37=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg37();
                
            }
                check();
            }            
         
            });
                b38 = new JButton();
                frame.add(b38);
                frame.setLayout(null);
                b38.setBounds(160, 400, 80, 80);
                setImg38();
                b38.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator38==0){
             indicator38++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg38();
        } 
                else if(indicator38==1){
            indicator38++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg38();
                }
            
            else if(indicator38==2){
            indicator38++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg38();
                
            }
           else if(indicator38==3){
           indicator38=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg38();
                
            }
                check();
            }            
         
            });
                b39 = new JButton();
                frame.add(b39);
                frame.setLayout(null);
                b39.setBounds(240, 400, 80, 80);
                setImg39();
                b39.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                 if(indicator39==0){
            indicator39++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg39();
        } 
                else if(indicator39==1){
           indicator39++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg39();
                }
            
            else if(indicator39==2){
            indicator39++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg39();
             }
           else if(indicator39==3){
           indicator39=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg39();
             }
                check();
            }            
         
            });
                b40 = new JButton();
                frame.add(b40);
                frame.setLayout(null);
                b40.setBounds(320, 400, 80, 80);
                setImg40();
                b40.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator40==0){
                indicator40++;
                count++;
                t.setText(String.format("Moves: %d ", count));
                setImg40();
            
        } 
                else if(indicator40==1){
                 indicator40++;
                 count++;
                 t.setText(String.format("Moves: %d ", count));
                  setImg40();       
            }
            
            else if(indicator40==2){
               indicator40++;
               count++;
               t.setText(String.format("Moves: %d ", count));
               setImg40();
            }
           else if(indicator40==3){
            indicator40=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg40();
             }
                check();
            }            
         
            });
                b41 = new JButton();
                frame.add(b41);
                frame.setLayout(null);
                b41.setBounds(400, 400, 80, 80);
                setImg41();
                b41.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator41==0){
            indicator41++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg41();
        } 
                else if(indicator41==1){
           indicator41=0;
            count++;
            t.setText(String.format("Moves: %d", count));
            setImg41();
        }      
           check();
            }            
         
            });
                b42 = new JButton();
                frame.add(b42);
                frame.setLayout(null);
                b42.setBounds(480, 400, 80, 80);
                setImg42();
                b42.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator42==0){
            indicator42++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg42();
        } 
                else if(indicator42==1){
           indicator42++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg42();
                }
            else if(indicator42==2){
           indicator42++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg42();
                
            }
             else if(indicator42==3){
            indicator42=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
             setImg42();   
            }
                check();
            }            
         
            });
                b43 = new JButton();
                frame.add(b43);
                frame.setLayout(null);
                b43.setBounds(0, 480, 80, 80);
                setImg43();
                b43.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
             if(indicator43==0){
            
            indicator43++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg43();
        } 
              else if(indicator43==1){
          indicator43=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg43();
        }       
           check();
            }            
         
            });
                b44 = new JButton();
                frame.add(b44);
                frame.setLayout(null);
                b44.setBounds(80, 480, 80, 80);
                setImg44();
                b44.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
               if(indicator44==0){
             indicator44++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg44();
        } 
                else if(indicator44==1){
            indicator44++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg44();
                }
            
            else if(indicator44==2){
            indicator44++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg44();
            }
           else if(indicator44==3){
            indicator44=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg44();
            }
                check();
            }            
         
            });
                b45 = new JButton();
                frame.add(b45);
                frame.setLayout(null);
                b45.setBounds(160, 480, 80, 80);
                setImg45();
                b45.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator45==0){
             indicator45++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg45();
        } 
                else if(indicator45==1){
            indicator45++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg45();
                }
            
            else if(indicator45==2){
            indicator45++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg45();
             }
           else if(indicator45==3){
            indicator45=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg45();
            }
                check();
            }            
         
            });
                b46 = new JButton();
                frame.add(b46);
                frame.setLayout(null);
                b46.setBounds(240, 480, 80, 80);
                setImg46();
                b46.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator46==0){
            indicator46++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg46();
        } 
                else if(indicator46==1){
           
            indicator46++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg46();
                }
            
            else if(indicator46==2){
            
            indicator46++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg46();
            }
           else if(indicator46==3){
               indicator46=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg46();
           }
                check();
            }            
         
            });
                b47 = new JButton();
                frame.add(b47);
                frame.setLayout(null);
                b47.setBounds(320, 480, 80, 80);
                setImg47();
                b47.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                
                if(indicator47==0){
           
            indicator47++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg47();
        } 
                else if(indicator47==1){
            
            indicator47++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg47();
                }
            
            else if(indicator47==2){
            indicator47++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg47();
            }
           else if(indicator47==3){
            indicator47=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg47();
            }
                check();
            }            
         
            });
                b48 = new JButton();
                frame.add(b48);
                frame.setLayout(null);
                b48.setBounds(400, 480, 80, 80);
                setImg48();
                b48.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
             if(indicator48==0){
            indicator48++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg48();
        } 
                else if(indicator48==1){
            indicator48++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg48();
                }
            
            else if(indicator48==2){
            indicator48++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg48();
            }
           else if(indicator48==3){
            indicator48=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg48();
                
            }
                check();
            }            
         
            });
                b49 = new JButton();
                frame.add(b49);
                frame.setLayout(null);
                b49.setBounds(480, 480, 80, 80);
                setImg49();
                b49.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(indicator49==0){
            indicator49++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg49();
        } 
                else if(indicator49==1){
            indicator49++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg49();
                }
            
            else if(indicator49==2){
            indicator49++;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg49();
                
            }
           else if(indicator49==3){
            indicator49=0;
            count++;
            t.setText(String.format("Moves: %d ", count));
            setImg49();
                
            }
                check();
            }            
         
            });
                           
    }
     void setImg1() {
         if(indicator==0){
        b1.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
        
       }
       else if(indicator==1){
           b1.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
       }
         else if(indicator==2){
           b1.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
       }
         else{
           b1.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
       }
     }
     void setImg2() {
        if(indicator2==0){
            b2.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottomTop.png")));
           
        } 
         else if(indicator2==1){
            b2.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRight.png")));
           
        }    
    }
     void setImg3() {
        if(indicator3==0){
            b3.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
        }
        else if(indicator3==1){
            b3.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
        }
        else if(indicator3==2){
            b3.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            
                }
            
            else {
            b3.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
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
        b5.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
        
       }
       else if(indicator5==1){
           b5.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
       }
         else if(indicator5==2){
           b5.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
       }
         else{
           b5.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
       }
         
     }
     void setImg6()
     {
     if(indicator6==0){
            b6.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
     }
                else if(indicator6==1){
            b6.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
            
                }
            
            else if(indicator6==2){
            b6.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            }
                else if(indicator6==3){
            b6.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));     
            }
     }
     void setImg7()
     {
         if(indicator7==0){
            b7.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            
        } 
                else if(indicator7==1){
            b7.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
           
                }
            
            else if(indicator7==2){
            b7.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
             }
                else if(indicator7==3){
            b7.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
             }
     }
     void setImg8()
     {
         if(indicator8==0){
            b8.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            
        } 
                else if(indicator8==1){
            b8.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            
                }
            
            else if(indicator8==2){
            b8.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
             }
                else if(indicator8==3){
            b8.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
            }
     }
     void setImg9()
     {
         if(indicator9==0){
            b9.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
        } 
                else if(indicator9==1){
            b9.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
            
                }
            
            else if(indicator9==2){
            b9.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
             }
                else if(indicator9==3){
            b9.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
             }
     }
     void setImg10()
     {
          if(indicator10==0){
            b10.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottomTop.png")));
           
        } 
         else if(indicator10==1){
            b10.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRight.png")));
           
        }  
     }
     void setImg11()
     {
         if(indicator11==0){
            b11.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
            
        } 
                else if(indicator11==1){
            b11.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            
                }
            
            else if(indicator11==2){
            b11.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
       }
                else if(indicator11==3){
            b11.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
             }
     }
     void setImg12()
     {
         if(indicator12==0){
            b12.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
        } 
                else if(indicator12==1){
            b12.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            
                }
            
            else if(indicator12==2){
            b12.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
             }
                 else if(indicator12==3){
            b12.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
             }
     }
     void setImg13()
     {
         if(indicator13==0){
            b13.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            
        } 
                else if(indicator13==1){
            b13.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
                }
            
            else if(indicator13==2){
            b13.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
              }
                else if(indicator13==3){
            b13.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
             }
     }
     void setImg14()
     {
         if(indicator14==0){
            b14.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            
        } 
                else if(indicator14==1){
            b14.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
           
                }
            
            else if(indicator14==2){
            b14.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            }
                 else if(indicator14==3){
            b14.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
             }
     }
     void setImg15()
     {
          
                if(indicator15==0){
            b15.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
        } 
                else if(indicator15==1){
            b15.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
                }
            
            else if(indicator15==2){
            b15.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
             }
                else if(indicator15==3){
            b15.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
             }
     }
     void setImg16()
     {
         if(indicator16==0){
            b16.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
        } 
                else if(indicator16==1){
            b16.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
                }
            
            else if(indicator16==2){
            b16.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
             }
                 else if(indicator16==3){
            b16.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
             }
     }
     void setImg17()
     {
         if(indicator17==0){
            b17.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
        } 
                else if(indicator17==1){
            b17.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
                }
            
            else if(indicator17==2){
            b17.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
             }
                 else if(indicator17==3){
            b17.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
             }
     }
     void setImg18()
     {
         if(indicator18==0){
            b18.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            
        } 
                else if(indicator18==1){
            b18.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            
                }
            
            else if(indicator18==2){
            b18.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
             }
                else if(indicator18==3){
            b18.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
             }
     }
     void setImg19()
     {
         if(indicator19==0){
            b19.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
        } 
                else if(indicator19==1){
            b19.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            
                }
            
            else if(indicator19==2){
            b19.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
             }
                else if(indicator19==3){
            b19.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
            }
     }
     void setImg20()
     {
         if(indicator20==0){
            b20.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottomTop.png")));
           
        } 
         else if(indicator20==1){
            b20.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRight.png")));
           
        }  
     }
     void setImg21()
     {
         if(indicator21==0){
            b21.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottomTop.png")));
           
        } 
         else if(indicator21==1){
            b21.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRight.png")));
           
        }       
     }
     void setImg22()
     {
          if(indicator22==0){
            b22.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
        } 
                else if(indicator22==1){
            b22.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
                }
            
            else if(indicator22==2){
            b22.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            }
                else if(indicator22==3){
            b22.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
             }
     }
     void setImg23()
     {
         if(indicator23==0){
            b23.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
            
        } 
                else if(indicator23==1){
            b23.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            
                }
            else if(indicator23==2){
            b23.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            }
                else if(indicator23==3){
            b23.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            }
           
     }
     void setImg24()
     {
          if(indicator24==0){
            b24.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            
        } 
                else if(indicator24==1){
            b24.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
                }
            
            else if(indicator24==2){
            b24.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
            }
                else if(indicator24==3){
            b24.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
            }
     }
     void setImg25()
     {
          if(indicator25==0){
            b25.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            
        } 
                else if(indicator25==1){
            b25.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
                }
            
            else if(indicator25==2){
            b25.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            }
                else if(indicator25==3){
            b25.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            }
     }
     void setImg26()
     {
         if(indicator26==0){
            b26.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
        } 
                else if(indicator26==1){
            b26.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
                }
            
            else if(indicator26==2){
            b26.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
             }
                else if(indicator26==3){
            b26.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            }
     }
      void setImg27()
     {
         if(indicator27==0){
            b27.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            
        } 
                else if(indicator27==1){
            b27.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
                }
            
            else if(indicator27==2){
            b27.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffleftRightBottom.png")));
             }
                else if(indicator27==3){
            b27.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
             }
     }
      void setImg28()
     {
         if(indicator28==0){
            b28.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
        } 
                else if(indicator28==1){
            b28.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
            
                }
            
            else if(indicator28==2){
            b28.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
            }
             else if(indicator28==3){
            b28.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            }   
     }
     void setImg29()
     {
         if(indicator29==0){
            b29.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
            
        } 
                else if(indicator29==1){
            b29.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
            
                }
            
            else if(indicator29==2){
            b29.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffleftRightTop.png")));
            }
                else if(indicator29==3){
            b29.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
           }
     }
     void setImg30()
     {
         if(indicator30==0){
            b30.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
        } 
                else if(indicator30==1){
            b30.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
           
                }
            
            else if(indicator30==2){
            b30.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
            }
                else if(indicator30==3){
            b30.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            
                
            }
     }
      void setImg31()
     {
         if(indicator31==0){
            b31.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
            
        } 
                else if(indicator31==1){
            b31.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            
                }
            
            else if(indicator31==2){
            b31.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            }
                else if(indicator31==3){
            b31.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
             }
     }
     void setImg32()
     {
         if(indicator32==0){
            b32.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
        } 
                else if(indicator32==1){
            b32.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
            
                }
            
            else if(indicator32==2){
            b32.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
             }
                else if(indicator32==3){
            b32.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
              }
     }
     void setImg33()
     {
         if(indicator33==0){
            b33.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            
        } 
                else if(indicator33==1){
            b33.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            
                }
            
            else if(indicator33==2){
            b33.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            }
                else if(indicator33==3){
            b33.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
             }
     }
      void setImg34()
     {
         if(indicator34==0){
            b34.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
            
        } 
                else if(indicator34==1){
            b34.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
            
                }
            
            else if(indicator34==2){
            b34.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
           }
                else if(indicator34==3){
            b34.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
             }
     }
     void setImg35()
     {
         if(indicator35==0){
            b35.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            
        } 
                else if(indicator35==1){
            b35.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
                }
            
            else if(indicator35==2){
            b35.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
             }
           else if(indicator35==3){
            b35.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
             }
     }
     void setImg36()
     {
         if(indicator36==0){
            b36.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            
        } 
                else if(indicator36==1){
            b36.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
            
                }
            
            else if(indicator36==2){
            b36.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            }
           else if(indicator36==3){
            b36.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
             }
     }
     void setImg37()
     {
         if(indicator37==0){
            b37.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            
        } 
                else if(indicator37==1){
            b37.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
            
                }
            
            else if(indicator37==2){
            b37.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
             }
            else if(indicator37==3){
            b37.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            }
     }
     void setImg38()
     {
          if(indicator38==0){
            b38.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
        } 
                else if(indicator38==1){
            b38.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
            
                }
            
            else if(indicator38==2){
            b38.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
            }
           else if(indicator38==3){
            b38.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            }
     }
   void setImg39()
     {
         if(indicator39==0){
            b39.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
        } 
                else if(indicator39==1){
            b39.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
                }
            
            else if(indicator39==2){
            b39.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
             }
           else if(indicator39==3){
            b39.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            }
     }
    void setImg40()
     {
         if(indicator40==0){
            b40.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
        } 
                else if(indicator40==1){
            b40.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            
                }
            
            else if(indicator40==2){
            b40.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            }
           else if(indicator40==3){
            b40.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
             }
     }
     void setImg41()
     {
         if(indicator41==0){
            b41.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottomTop.png")));
            
        } 
                else if(indicator41==1){
            }      
     }
      void setImg42()
     {
         if(indicator42==0){
            b42.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
        } 
                else if(indicator42==1){
            b42.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
            
                }
            
            else if(indicator42==2){
            b42.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
            }
             else if(indicator42==3){
            b42.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
             }
     }
     void setImg43()
     {
          if(indicator43==0){
            b43.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRight.png")));
            
        } 
              else if(indicator43==1){
            b43.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottomTop.png")));
           
        }       
     }
     void setImg44()
     {
         if(indicator44==0){
            b44.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
            
        } 
                else if(indicator44==1){
            b44.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
            
                }
            
            else if(indicator44==2){
            b44.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
            
                
            }
           else if(indicator44==3){
            b44.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
                
            }
     }
     void setImg45()
     {
         if(indicator45==0){
            b45.setIcon(new ImageIcon(netwalk.class.getResource("/picture/ServerOnLeftRightTop.png")));
            
        } 
                else if(indicator45==1){
            b45.setIcon(new ImageIcon(netwalk.class.getResource("/picture/ServerOnLeftBottomTop.png")));
            
                }
            
            else if(indicator45==2){
            b45.setIcon(new ImageIcon(netwalk.class.getResource("/picture/ServerOnLeftRightBottom.png")));
            }
           else if(indicator45==3){
            b45.setIcon(new ImageIcon(netwalk.class.getResource("/picture/ServerOnRightBottomTop.png")));
              }
     }
    void setImg46()
     {
         if(indicator46==0){
            b46.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
            
        } 
                else if(indicator46==1){
            b46.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            
                }
            
            else if(indicator46==2){
            b46.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
             }
           else if(indicator46==3){
            b46.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
             }
     }
     void setImg47()
     {
         if(indicator47==0){
            b47.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRight.png")));
            
        } 
                else if(indicator47==1){
            b47.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffTop.png")));
                }
            else if(indicator47==2){
            b47.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeft.png")));
           }
           else if(indicator47==3){
            b47.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffBottom.png")));
            }
     }
    void setImg48()
     {
          if(indicator48==0){
            b48.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottomTop.png")));
            
        } 
                else if(indicator48==1){
            b48.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightBottom.png")));
              }
            
            else if(indicator48==2){
            b48.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottomTop.png")));
            }
           else if(indicator48==3){
            b48.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftRightTop.png")));
             }
     }
      void setImg49()
     {
         if(indicator49==0){
            b49.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightBottom.png")));
            
        } 
                else if(indicator49==1){
            b49.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffRightTop.png")));
            
                }
            else if(indicator49==2){
            b49.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftTop.png")));
             }
           else if(indicator49==3){
            b49.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OffLeftBottom.png")));
             
            }
     }
    void check()
    {
        if(indicator==0&&indicator2==0&&indicator3==0&&indicator4==0&&indicator5==0&&indicator6==0&&
                indicator7==0&&indicator8==0&&indicator9==0&&indicator10==0&&indicator11==0&&indicator12==0&&
                indicator13==0&&indicator14==0&&indicator15==0&&indicator16==0&&
                indicator17==0&&indicator18==0&&indicator19==0&&indicator20==0&&indicator22==0&&
                indicator23==0&&indicator24==0&&indicator25==0&&indicator26==0&&
                indicator27==0&&indicator28==0&&indicator29==0&&indicator21==0&&indicator30==0&&
                indicator32==0&&indicator33==0&&indicator34==0&&indicator35==0&&indicator36==0&&
                indicator37==0&&indicator38==0&&indicator39==0&&indicator31==0&&indicator40==0&&
                indicator41==0&&indicator42==0&&indicator43==0&&indicator44==0&&indicator45==0&&indicator46==0&&
                indicator47==0&&indicator48==0&&indicator49==0)
        {
            b1.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeft.png")));
            b2.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnBottomTop.png")));
            b3.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRightBottom.png")));
             b4.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftBottomTop.png")));
             b5.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRight.png")));
              b6.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftTop.png")));
              b7.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRightTop.png")));
              b8.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRightBottom.png")));
              b9.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftBottomTop.png")));
              b10.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnBottomTop.png")));
              b11.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRightBottomTop.png")));
            b12.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeft.png")));
            b13.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnBottom.png")));
             b14.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnBottom.png")));
             b15.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnTop.png")));
              b16.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnTop.png")));
              b17.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnTop.png")));
              b18.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRightTop.png")));
              b19.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeft.png")));
              b20.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnBottomTop.png")));
              b21.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnBottomTop.png")));
            b22.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRight.png")));
            b23.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftBottom.png")));
             b24.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnBottom.png")));
             b25.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnBottom.png")));
              b26.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRight.png")));
              b27.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftRightTop.png")));
              b28.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftBottomTop.png")));
              b29.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftRightBottom.png")));
              b30.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftBottomTop.png")));
              b31.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRightBottomTop.png")));
            b32.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftBottomTop.png")));
            b33.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRightBottom.png")));
             b34.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftRightBottom.png")));
             b35.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftRightTop.png")));
              b36.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftTop.png")));
              b37.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRightTop.png")));
              b38.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftBottomTop.png")));
              b39.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnTop.png")));
              b40.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnTop.png")));
              b41.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnBottomTop.png")));
            b42.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRight.png")));
            b43.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftRight.png")));
             b44.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftRightBottom.png")));
             b45.setIcon(new ImageIcon(netwalk.class.getResource("/picture/ServerOnLeftRightTop.png")));
              b46.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftBottom.png")));
              b47.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRight.png")));
              b48.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnLeftBottomTop.png")));
              b49.setIcon(new ImageIcon(netwalk.class.getResource("/picture/OnRightBottom.png")));
              int p=JOptionPane.showConfirmDialog(null, "You win\nplay again??","",JOptionPane.YES_NO_OPTION);
            if(p==JOptionPane.YES_OPTION)
            {
                frame.dispose(); 
                netwalk n=new netwalk();
                 
            }
            else
            {
                 frame.dispose();
            }
        }
       
    }
    
     
}
