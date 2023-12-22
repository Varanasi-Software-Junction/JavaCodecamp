


package himanshu.dowhileloop;

import java.util.Scanner;


public class Printingnumbereverse2 {
  
    public static void main(String[] args) {
        System.out.println("Enter the number");
        int a = (new Scanner(System.in).nextInt());
        int i,t=1;
        do {
            i =  a*a;
            System.out.println(i);
            a--;
                    t++;
        }
       while(t<10);
        
        
    }
            

}
