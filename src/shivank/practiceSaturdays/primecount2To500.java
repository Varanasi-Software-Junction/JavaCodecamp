package practiceSaturdays;
import java.util.*;
public class primecount2To500 {
    
    public static void main(String[] args) {
        
        int c=0;
        System.out.print("2 3 ");
        for(int i=5;i<=500;i+=2)
        {
            int flag=1;
           // System.out.println();
            for(int j=2;j<=(int)Math.sqrt((double)i);j++)
            {
                
                if(i%j!=0)
                continue;
                   flag=0;
                    break;
                
                


            }
            if(flag==1)
            {
                c++;
                System.out.print(i+" ");
            }

        }
        System.out.print(c);

    }
    
}
