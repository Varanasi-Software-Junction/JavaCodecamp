package sorting;
public class partitioning { 
    public static void print(int a[])
    {
        for(int k=0;k<=a.length-1;k++)
        System.out.print(a[k]+" ");
        System.out.println();
    }
    
    public static void main(String args[]) 
    {
        int a[]={4,1,8,2,5,2,5};
        int count=0,i,j;
        int pivot=a[0];
        
        for(i=1;i<=a.length-1;i++)
        {
            if(a[i]<pivot)
            count++;
        }
              System.out.println(count);
                        i=0;
                     j=a.length-1;
                    int t=a[0];
                    a[0]=a[count];
                 a[count]=t;
                 print(a);
                   i=0;
                     j=a.length-1;
                 while(true)
           {
                      while(a[i]<=pivot && i<j)
                       i++;
                   while(a[j]>=pivot && i<j)
                j--;
                   System.out.println("*"+i+" "+j);
                  if(i>=j)
                    break;
                        t=a[i];
                      a[i]=a[j];
                      a[j]=t;
                       print(a);
               }
                    print(a);        
    }
     }
   
