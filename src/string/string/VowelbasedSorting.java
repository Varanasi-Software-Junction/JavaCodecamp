package string;

import java.util.Arrays;

public class VowelbasedSorting
 {
     VowelbasedSorting()
     {

     }
    public static void main(String[] args) {
        
    
    String a[]={"Shyam","Laxman","Ram","Matang","Kashyap","Agastya","Bhrigu"};
    int b[]=new int[a.length];
    for(int i=0;i<a.length;i++)
    {
        String s=a[i].toLowerCase();
        int c=0;
        for(int p=0;p<s.length();p++)
        {
            char x=(s.charAt(p));
            if(x=='a' || x=='e' ||x=='i' || x=='o'||x=='u')
            c++;
        }
        b[i]=c;

    }
    System.out.println(Arrays.toString(b));
    for(int i=0;i<b.length;i++)
    {
        for(int j=0;j<=b.length-2-i;j++)
        {
            if(b[j]>b[j+1])
            {
                int temp=b[j+1];
                b[j+1]=b[j];
                b[j]=temp;
                String temp1=a[j+1];
                a[j+1]=a[j];
                a[j]=temp1;

            }



        }
    }
    System.out.println(Arrays.toString(b));
    System.out.println(Arrays.toString(a));
    }
    
}
