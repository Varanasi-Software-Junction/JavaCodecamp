package stack.stack;

import java.util.Arrays;


public class pair {
    public static int x;
    int a;
    int b;
    pair(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
    public static void print(pair b[])
    {
        for(int i=0;i<5;i++)
        System.out.println((b[i]));

    }
    @Override
    public String toString()
 {
return "{"+a+","+b+"}";
 }   



    public static void main(String[] args) {
        
        

        pair a[]=new pair[100];
        a[0]=new pair(1,2);
        a[1]=new pair(3,4);
        a[2]=new pair(3,7);
        print(a);


    }
    
}
