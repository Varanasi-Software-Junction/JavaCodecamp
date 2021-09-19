package string;

import java.util.*;
public class SumNumbersINaString {
    public static void main(String args[])
    {
    String s="sdnvjdvdsv12dsvjbvs7svknsdv5d4svs";
    String s1="";
    int zero='0';
    String pos="";
    s+=" ";
    int sum=0;
    char ch[]=s.toCharArray();
    for(int i=0;i<ch.length;i++)
    {
        
        if((int)ch[i]>=zero && (int)ch[i]<=zero+9 )
        {
           // pos=i;
            s1+=ch[i];
            //continue;
           // s1.subs
        }
        //System.out.print(s1+"*");
        if((int)ch[i]<zero || (int)ch[i]>zero+9 )
        {pos=s1;
            if(pos!="")
            {
                //System.out.println(pos);
                sum+=Integer.parseInt(pos);
            }
        s1="";
        }
        

            
        //System.out.println(pos+"*");

    }
    System.out.println(sum);
}
    
}
