package stack;
import java.util.*;


public class SeptLong4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=6;
        long x=sc.nextLong();
        int c=1,c1=1;
        long a[]=new long[100000];
        Arrays.sort(a);
        Map<Long,Integer> m1=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int value=m1.getOrDefault(a[i],0);
            m1.put(a[i],value+1);
            if(value+1>c)
            c=value+1;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(c);
        int pos=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=a[i]^x;
            int value=m1.getOrDefault(a[i],0);
            m1.put(a[i],value+1);
            if(value+1>c1)
            c1=value+1;
            
        }
        System.out.println(Arrays.toString(a));
        System.out.println(c1);
        if(c1>c)
        System.out.println(c1+" "+(c1-c));
        else
        System.out.println(c+" "+0);
        




    }
    
}
