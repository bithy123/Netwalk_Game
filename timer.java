
package spl1;

import javax.swing.JTextField;


public class timer extends level_easy{
  
    public static void main(String[]args) {
              int i;
        int h=0,m=0,s=0;
        while(true){
            s++;
        if(s==60){
            m++;
            s=0;
            if(m==60){
                h++;
                m=0;
            }
        }
        level_easy.t4.setText(String.valueOf(s));
        level_easy.t3.setText(String.valueOf(h));
        level_easy.t2.setText(String.valueOf(m));
       
        }
    }
}
