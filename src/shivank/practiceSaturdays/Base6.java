package practiceSaturdays;

import java.util.Vector;
import java.util.*;
public class Base6 {
    public static void main(String[] args) {
        Vector<Integer> v1=new Vector<>();
        Vector<Integer> v2=new Vector<>();
        Scanner sc=new Scanner(System.in);
        v1.add(0);
        v1.add(0);
        v1.add(1);
        v1.add(1);
        int m=1;
        System.out.println(v1);
        int sum=0;
        for(int i=0;i<v1.size();i++)
        {
            sum+=m*v1.elementAt(i);
            m*=2;


        }
        //System.out.println(sum);
        while(sum>0)
        {
            int quo=sum%6;
            v2.add(quo);
            sum/=6;
        }
        System.out.println(v2);

        

    }
    
}
