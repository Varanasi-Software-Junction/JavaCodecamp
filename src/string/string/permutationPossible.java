package string;

import java.util.Arrays;

public class permutationPossible {
    static int count=0;
    static boolean find(char c[],int pos,char v)
    {
        for(int i=0;i<=pos-1;i++)
        {if(c[i]==v)
        return true;}
        return false;
    }
    public static void permute(int index,int maxindex,char c[],char ch[])
    {
        
        for(int i=0;i<maxindex;i++)
        {
            
            if(find(c,index,ch[i]))
            continue;
            c[index]=ch[i];
            if(index==maxindex-1)
            {   
                //count++;
                System.out.println(Arrays.toString(c)+" "+ ++count);
            
            }else
            permute(index+1,maxindex,c,ch);
                
            
        }
        //System.out.println(count);
        
    }
    public static void main(String args[])
    {
        String s="RCO";
        char ch[]=s.toCharArray();
        
        int n=ch.length;
        char c[]=new char[n];
        permute(0,n,c,ch);   
    }
}
