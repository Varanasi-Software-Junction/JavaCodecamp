
package switchpackage;

import java.util.Scanner;

public class SwitchSample {
    public static void main(String[] args) {
        int n= (new Scanner(System.in)).nextInt();
        switch(n)
        {
            case 0:
                System.out.println("Zero");
                break;
            case 1: System.out.println("One");
            break;
            case 2: System.out.println("Two");
            break;
            case 3: System.out.println("three");
            break;
            case 4: System.out.println("four");
            break;
            case 5: System.out.println("five");
            break;
            case 6: System.out.println("six");
            break;
            case 7: System.out.println("seven");
            break;
            case 8: System.out.println("eight");
            break;
            case 9: System.out.println("nine");
            
            default:
                System.out.println("Default");
        }
    }
}
