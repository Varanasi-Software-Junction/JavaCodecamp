package ifelse;

import java.util.Scanner;

public class Happy {
    public static void main(String[] args) {
        
        
        int n=4;
        String output="," + n + ",";
        while(true)
        {
            int sum=0;
            while(n>0)
            {
                int rem=n % 10;
                sum = sum + rem*rem;
                n=n/10;
            }
            if(sum==1)
            {
                System.out.println("Happy");
                return;
            }
            String newnumber="," + sum + ",";
            if(output.contains(newnumber))
            {
                System.out.println("Not Happy");
                System.out.println(output + newnumber);
                return;
            }
            output+=newnumber;
            System.out.println(output);
            n=sum;
        }
    }
  
}
