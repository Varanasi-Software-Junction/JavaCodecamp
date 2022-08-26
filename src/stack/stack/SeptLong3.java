package stack.stack;
import java.util.*;

//import javax.lang.model.util.ElementScanner14;
public class SeptLong3 {
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int countOdd=0,countEven=0;
            for(int i=0;i<a.length;i+=2)
            {
                if(a[i]%2!=0)
                {
                    countOdd+=1;
                }
            }
            for(int i=1;i<a.length;i+=2)
            {
                if(a[i]%2==0)
                {
                    countEven+=1;
                }
            }
            int sum=0;
            if(countEven<countOdd)
            sum+=2*countEven;
            else 
            sum+=2*countOdd;
            sum+=(a.length-countEven-countOdd);

            System.out.println(Arrays.toString(a));
            System.out.println(sum);
            t--;
        }

    }
    
}
