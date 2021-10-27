package practiceSaturdays;
import java.util.*;
public class pythagoreasTripletPrac {
    public static void main(String[] args) {
        int c=0;
        for(int i=1;i<=100;i++)
        {
            for(int j=i+1;j<=100;j++)
            {
                int y=(i*i)+(j*j);
                double z=(Math.sqrt((double)y));
               // System.out.println(z+"*");
                if(y<=10000 && z-(int)z==0)
                {
                    
                c++;
                System.out.println(i+" "+j+" "+(int)z);
                }
            }
        }
        System.out.println(c);
    }
    
}
