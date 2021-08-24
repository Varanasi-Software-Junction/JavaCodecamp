package shivank;
public class binary
{
    public static void main(String args[])
    {
        int a[]={1,2,5,7,12,15};
        int n=12;
        
        int low=0,last=a.length-1;
        while (true)
        {
            int mid=(low+last)/2;
            if(n==a[mid])
            {
            System.out.println(n+" found at position "+(mid));
            
            return;
            }
        else if(n>a[mid])
        low=mid+1;
        else
        last=mid-1;
if(low > last)
{
    System.out.println("Not found");
            
    return;
}
        
        }
        

      
        
    }

}