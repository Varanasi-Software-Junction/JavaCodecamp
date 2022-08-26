package shivank.shivank;

import java.util.Arrays;
import java.util.Comparator;

public class Generic<shiv> implements Comparator<Integer>
{
    shiv k[];
    Generic(shiv k[])
    {
this.k=k;
    }
    public void display()
    {
        System.out.println(Arrays.toString(k));
        for(int i=0;i<k.length;i++)
        {
            for(int j=0;j<k.length-1-i;j++)
            {
           // if (compare((int)k[j],(int) k[j+1])>0)
                {
                    shiv comp=k[j];
                    k[j]=k[j+1];
                    k[j+1]=comp;

                    
                }
            }
        }
        System.out.println(Arrays.toString(k));
        
        
    }
    
    public static void main(String[] args) {
        int h[]={9,8,7,6};
      //  Generic<Integer> obj=new Generic<>(h);
      //  obj.display();

    }
    
    @Override
    public int compare(Integer o1, Integer o2) {
        if( o1<o2)
        return -1;
        if( o1>o2)
        return 1;
        return 0;
    }
    
    
    
    
}