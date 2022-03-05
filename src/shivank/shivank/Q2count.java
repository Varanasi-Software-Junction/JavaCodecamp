package shivank.shivank;

import java.util.*;
public class Q2count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence to know count of words and letters: ");
        String s=sc.nextLine();
        int y=s.length();
        int c=0;
        for(int i=0;i<y;i++)
        {
            if(s.charAt(i)==' ')
            c++;
            
        }
        System.out.println("No. of Words: "+(c+1));
        System.out.println("No. of letters: "+(y-c));


    }
    
}
