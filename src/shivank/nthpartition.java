package shivank;
import java.util.Arrays;


public class nthpartition{
    public static void main(String args[])
    {
        int a[]={3,1,9,2,5,7};
        int n=10;
        System.out.println(Arrays.toString(a));
        if(n<=0 || n>=a.length)
        {
            System.out.println("Invalid request");
            return;
        }
        n--;
        int left=0,right=a.length-1;
        while(true)
        {
int pivot=a[left];
int pos=left,t;
for(int i=left +1;i<=right;i++)
{
    if(a[i]>=pivot)
    continue;
pos++;
t=a[pos];
a[pos]=a[i];
a[i]=t;
}
t=a[left];
a[left]=a[pos];
a[pos]=t;
if(pos==n)
{
    System.out.println("Value=" + pivot);
    System.out.println(Arrays.toString(a));
    return;
}
if(n<pos)
right=pos-1;
else 
left = pos +1;
        }
        
        


    }
    public static int partition(int a[],int start,int end)
    {
        int coun=0;
        //int p=9;
        int pivot=a[start];
        for(int i=start;i<=end;i++)
        {
            if(pivot>a[i])
            coun++;
        }
        //System.out.println(start);
        int t=a[coun];
        a[coun]=a[start];
        a[start]=t;
        //System.out.println(Arrays.toString(a));
        int i=start;
        int j=end;
        while(true)
        {
            while(a[i]<=pivot && i<j)
            i++;
            while(a[j]>=pivot && i<j)
            j--;
            if(i>=j)
            break;
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }

    System.out.println(Arrays.toString(a));
    return coun; 
    //if(p==coun) 
    //{
      //  System.out.println(a[p]);
        //return;
 
    //}
    }
    
    
}