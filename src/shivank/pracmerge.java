package shivank;


public class pracmerge{

    
    static void merge(int a[],int left,int right)
    {
        if(left>right)
        return;
        int mid = (left + right)/2;
        merge(a, left, mid);
        merge(a, mid+1, right);
        //0-mid,  mid+1 -right
        

    }

    public static void main(String args[])
{
    
    int a[]={8,4,5,2,1};
    merge(a,0,a.length-1);
    
}
}