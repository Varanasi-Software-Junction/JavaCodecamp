package shivank;
import java.util.Arrays;
public class insertion
{
    public static void main(String args[])
    {
        int a[]={9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<=a.length-2;i++)
        {
            if(a[i]<=a[i+1])
            continue;
            int t=a[i+1];
            int j=i + 1;
            while(j>=1 &&  a[j-1]>t)
            {
                
                a[j]=a[j-1];
                j--;
                
                
            }
            a[j]=t;
        }
            
            System.out.println(Arrays.toString(a));
            
        }
        //System.out.println(Arrays.toString(a));


    }
