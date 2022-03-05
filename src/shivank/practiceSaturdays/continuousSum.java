package shivank.practiceSaturdays;

import java.util.Arrays;

public class continuousSum {
  static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int a[]={-1,-2,8,-5,3,-3,-4};
        int len=a.length-1;
        
        int sum=0;
        //int j=len;
        //int i=0;
        

        
        
        for(int j=0;j<=len;j++)
        {
          sum+=a[j];
          
            if(sum>max)
            max=sum;
            if(sum<0)
            sum=0;
            
            System.out.println(max+" "+sum);
        }
        
    }
    
}
