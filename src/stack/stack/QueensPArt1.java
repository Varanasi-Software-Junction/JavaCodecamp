package stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class QueensPArt1 {
    public static void main(String[] args) {
      
        System.out.println();
        Position(6,3);
       // Set<Integer,Integer> s1=new HashSet<>();
        
    }
    public static void Position(int x1,int y1)
    {
        
int x=1,y=y1;
        while(x<=8 && y<=8)
        {
            System.out.println(x+" "+y);
            x+=1;
        }
        int a=x1,b=1;
        while(a<=8 && b<=8)
        {
            System.out.println(a+" "+b);
            b+=1;
        }
        a=x1;
        b=y1;
        while(a<=8 && b<=8 && b>=1 && a>=1)
        {
            
            if(a-b==x1-y1)
            System.out.println(a+" "+b);
            a+=1;
            b+=1;

        }
        a=x1;
        b=y1;
        while(a<=8 && b<=8 && b>=1 && a>=1)
        {
            
            if(a+b==x1+y1)
            System.out.println(a+" "+b);
            a+=1;
            b-=1;

        }
        a=x1;
        b=y1;
        while(a<=8 && b<=8 && b>=1 && a>=1)
        {
            
            if(a-b==x1-y1)
            System.out.println(a+" "+b);
            a-=1;
            b-=1;

        }
        a=x1;
        b=y1;
        while(a<=8 && b<=8 && b>=1 && a>=1)
        {
            
            if(a+b==x1+y1)
            System.out.println(a+" "+b);
            a-=1;
            b+=1;

        }

    }
    
}
