


package himanshu.whileloop;

import java.util.Scanner;


public class Whileloopnumbertoworld {
    public static void main(String[] args) {
        int number  = 0 ;
        while(number<=9){
            
            switch(number){
            case 0 :
            System.out.println("zero");
            break;
            case 1:
                            System.out.println("one");
                            break;
            case 2 :
                            System.out.println("Two");
                            break;
            case 3 :
                            System.out.println("Three");
                            break;
            case 4 :
                            System.out.println("Four");
                            break;
            case 5 :
                            System.out.println("Five");
                            break;

            case 6 :
                            System.out.println("Six");
                            break;
            case 7 :
                            System.out.println("Seven");
                            break;
            case 8 :
                            System.out.println("Eight");
                            break;
            case 9 :
                            System.out.println("Nine");
                            break;
            default :
                            System.out.println("you have enter the wrong number");

            
            
           
        }
            number++;
        }
    }

    private static void Switch(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
