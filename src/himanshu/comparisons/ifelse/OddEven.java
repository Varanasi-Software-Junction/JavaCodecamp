package himanshu.comparisons.ifelse;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int a,b;
        System.out.println("enter the no");
        Scanner sc = new Scanner (System.in);
        a=sc.nextInt();
        if(a%2==0){
            System.out.println("A is the even ="+a);
            
        }
        else{
            System.out.println("a is odd="+a);
        }
        }
    }
    
    

