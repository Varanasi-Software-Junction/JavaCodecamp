package shivank.practiceSaturdays;
import java.util.Arrays;
public class arrayTriplets{
    public static void main(String[] args) {
        int a[]={5,1,3,4,7};
        int limit=12;
        int first=0;
        int len=a.length-1;
        int last=a.length-1;
        //Arrays.sort(a);
        while(true)
        {
            if(first+1==len)
            break;
            if(first+1==last)
            {
                ++first;
                last=len;
                
            }
            if(a[first]+a[first+1]+a[last]<limit)
            {
                System.out.println(a[first]+","+a[first+1]+","+a[last]);
                --last;

            }
            if(a[first]+a[first+1]+a[last]>=limit)
            --last;

            
            
        }
    }
}