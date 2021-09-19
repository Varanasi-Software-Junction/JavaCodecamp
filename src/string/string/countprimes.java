package string;
import java.util.*;
public class countprimes {
    public static void main(String args[])
    {
        int count=2;
        int a=2;
        int b=3;
        int n=500;
        System.out.print(a+" "+b+" ");
        for(int i=5;i<n;i+=2)
        {
            int flag=1;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j!=0)
                continue;
                flag=0;
                break;

            }
            if(flag==1)
            {System.out.print(i+" ");
                count++;}

        }
        System.out.println("\n from 1 to "+n+" there are "+count+" primes");


    }
}
