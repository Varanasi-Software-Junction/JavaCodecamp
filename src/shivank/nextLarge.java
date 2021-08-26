package shivank;
import java.util.*;
import java.util.Arrays;
public class nextLarge
{
    public static void main(String args[])
    {
        int n=1453;
        String s=""+n;
        char a[]=s.toCharArray();
        Arrays.sort(a);
        String dig=new String(a);
        String rev="";
        for(char c:a)
        {
            rev=c+rev;
        }
        int num=Integer.parseInt(rev);

        for(int i=n+1;i<=num;i++)
        {
            char q[]=(""+i).toCharArray();
            Arrays.sort(q);
            String s1=new String(q);
            if(s1.equals(dig))
            {
                System.out.println(i);
                return;
            }


        }
    }
}