class Array8
{
    public static void main(String[] args) 
    
    { 
        int arr[]={2,9,7,4,1,0,11,15};
        int r=arr.length-1;
        int max=Integer.MAX_VALUE;
        int pos=-1;
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]<max)
            {max=arr[i];
                pos=i;
            }
            
        }
        int temp=arr[pos];
        arr[pos]=arr[r];
        arr[r]=temp;
        System.out.println(arr[r]);

    }
}