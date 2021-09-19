package stack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


 

    // Demonstrate Pair class provided by `JavaTuples` Library in Java
    
         


public class QueensAlog
{
    int a;
    int b;
    QueensAlog(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
    public static void print(QueensAlog b[])
    {
        for(int i=0;i<5;i++)
        System.out.println((b[i]));

    }
    @Override
    public String toString()
 {
return "{"+a+","+b+"}";
 }   

    static int z=0;
    public static void main(String[] args) {
        int x=0;
        int y=0;
       
        int QueenCount=1;
        //new pair(a, b); 
        while(QueenCount<8)
        {
            
            pair a1[]=new pair[100];
            int i=1;
            while(i<=8)
            {   int flag=1;
                for(int j=1;j<=8;j++)
                {
                    if(Position(i,j,a1))
                    {
                        System.out.println(i+" "+j);
                        QueenCount++;
                        flag=0;
                        break;
                    }
                } 
                if(flag==1)
                i--;
                else
                i++;
                    
            }
        }
            
            
        
    }
        public static boolean Position(int x1,int y1,QueensAlog a1[])
    {
        
        
int x=1,y=y1;
        while(x<=8 && y<=8)
        {
            for(int i=0;i<100;i++)
            {
                if(a1[i].x==x1 && a1[i].y==x1)
                continue;
            }
                a1[z++]=new pair(x,y);
            //System.out.println(x+" "+y);
            x+=1;
        }
        int a=x1,b=1;
        while(a<=8 && b<=8)
        {
            a1[z++]=new pair(a,b);
            
            //System.out.println(a+" "+b);
            b+=1;
        }
        a=x1;
        b=y1;
        while(a<=8 && b<=8 && b>=1 && a>=1)
        {
            
            if(a-b==x1-y1)
            a1[z++]=new pair(a,b);
            //System.out.println(a+" "+b);
            a+=1;
            b+=1;

        }
        a=x1;
        b=y1;
        while(a<=8 && b<=8 && b>=1 && a>=1)
        {
            
            if(a+b==x1+y1)
            a1[z++]=new pair(a,b);
            //System.out.println(a+" "+b);
            a+=1;
            b-=1;

        }
        a=x1;
        b=y1;
        while(a<=8 && b<=8 && b>=1 && a>=1)
        {
            
            if(a-b==x1-y1)
            a1[z++]=new pair(a,b);
            //System.out.println(a+" "+b);
            a-=1;
            b-=1;

        }
        a=x1;
        b=y1;
        while(a<=8 && b<=8 && b>=1 && a>=1)
        {
            
            if(a+b==x1+y1)
            a1[z++]=new pair(a,b);
            System.out.println(a+" "+b);
            a-=1;
            b+=1;

        }
        pair obj=new pair(x1,y1);
        for(int i=0;i<100;i++)
        {
            System.out.println(obj.a+" "+obj.b);
            if(obj.a==x1 && obj.b==y1)
            return false;
            

        }
        return true;
    }
}