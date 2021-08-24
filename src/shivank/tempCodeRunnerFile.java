package shivank;
import java.util.*;
public class aug2
{
    public static void main(String args[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int a[]=new int[4];
            for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();                
            }
            int q=(a[0]==a[1] && a[1]==a[2] && a[2]==a[3])?0:(a[0]==a[1] || a[1]==a[2] || a[2]==a[3])?((a[0]==a[1] && a[0]==a[2])||(a[1]==a[2] && a[1]==a[3])|| (a[0]==a[1] && a[1]==a[3]) || (a[0]==a[2] && a[0]==a[3]))?1:2:2;
            System.out.println(q);
            t--;

        }
    }
}