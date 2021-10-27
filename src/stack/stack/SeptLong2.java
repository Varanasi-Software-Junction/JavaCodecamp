package stack;
import java.util.*;
public class SeptLong2 {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int a[]=new int[3];
            for(int i=0;i<3;i++)
            a[i]=sc.nextInt();
            String s=sc.next();
            int sum=0;
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='0')
                sum+=a[1];
                else
                sum+=a[2];
            }

            

            System.out.println(sum);
            t--;
        }
    }
    
}
