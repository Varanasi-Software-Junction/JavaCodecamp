package ternary;
public class selection{

    public static void main(String args[])
    {
        int a[]={5,4,3,2,1};
       //SelectionSort(a);
        //printArray(a);
        BubbleSort(a);

    }        
            
static void BubbleSort(int[] a)
{
    for(int i=0;i<=a.length-2;i++)
    {
        for(int j=0;j<=a.length-2-i;j++)
        {
            if(a[j]>a[j+1])
        {
            int m=a[j];
            a[j]=a[j+1];
            a[j+1]=m;
        }

        }

    }
    printArray(a);
}



static void printArray(int[] a)
{
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]+",");
}
    public static void SelectionSort(int[] a)
    {
        
        for(int i=0;i<=a.length-2;i++)
        {
            

            
            int min=a[i],pos=i;
            for(int j=i+1;j<=a.length-1;j++)
            {
                
                if(min>a[j])
                {
                    min=a[j];
                    pos=j;
                }
            }
                a[pos]=a[i];
                a[i]=min;
                
                    
                    
            
        }

    } 

}

