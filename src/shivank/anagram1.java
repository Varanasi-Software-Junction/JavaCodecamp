package shivank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;
public class anagram1
{
    public static void main(String []args) 
    {
        
        Scanner sc=new Scanner(System.in);
        Vector<Integer> s=new   Vector<>();
        int hap=sc.nextInt();
        
        int num=hap;
        while(true)
        {
            int sum=0;
            


        while(hap>0)
        {
            int rem=hap%10;
            sum+=(rem*rem);
            hap/=10;
        }
        if(sum==1)
        {
            System.out.println(num+" is Happy");
            return ;
        }
        if(s.contains(sum))
        {
            System.out.println(num+" is not Happy");
            s.add(sum);
        System.out.println(s);
            return ;
        }
        s.add(sum);
        hap=sum;
        System.out.println(s);
}
}
}