package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class Generic<shiv> implements Comparator<String>
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
            if (compare((String)k[j],(String) k[j+1])>0)
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
        String h[]={"Srimant","King","Queen"};
        Generic<String> obj=new Generic<>(h);
        obj.display();

    }
    
    @Override
    public int compare(String o1, String o2) {
        if(o1.length()>o2.length())
        return -1;
        if(o1.length()<o2.length())
        return 1;
        return 0;
    }
    
    
    
}