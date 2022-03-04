      package sorting;
      import java.util.Arrays;
      public class smallestnumber{
      public static void print(int a[])
    {
        for(int k=0;k<=a.length-1;k++)
        System.out.print(a[k]+" ");
        System.out.println();
    }
           public static void main(String args[]) 
    {
            int[] a={4,1,20,7,17,21};
             System.out. println(Arrays.toString(a)); 
             int pos=2;
             if(pos<=0 || pos>a.length)
             {
                 System.out.println("Invalid Range");
                 return;
             }
                 int left=0,right=a.length-1;
                 int t;
                 pos--;
                while(true)
{
               int fp=left;
               int pivot=a[left];
               for(int i=left + 1;i<=right;i++)
    {
                if(a[i]>=pivot)
                 continue;
                fp++;
            t=a[i];
        a[i]=a[fp];
        a[fp]=t;
        
    }
    t=a[fp];
    a[fp]=a[left];
    a[left]=t;
    if(fp==pos)
    {
        System.out.println("Pivot = " +pivot);
        System.out. println(Arrays.toString(a)); 
        return;
    }
    
    if (pos<fp)
        right=fp-1;
    else
        left=fp+1;
    
}
  }
}
   



  


