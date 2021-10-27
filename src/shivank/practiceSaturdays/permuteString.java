package practiceSaturdays;

import java.util.Arrays;

public class permuteString {
    static boolean find(int pos, char a[],int c)
    {
        for(int i=0;i<=pos-1;i++)
        {
            if(a[i]==a[c])
            return true;
        }
        return false;

        

    }

    public static void main(String[] args) {
        int n=4;
        String s="";
        for(int i=1;i<=n;i++)
        s+=i+"";
        //String s="RCO";
        char s1[]=s.toCharArray();
        //System.out.println(Arrays.toString(s1));
        permute(s1,0,s1.length-1);
        
    }
    static void permute(char s1[],int pos,int max)
    {
        for(int i=0;i<s1.length;i++)
        {
        if(find(i,s1,pos))
        continue;
        s1[i]=s1[pos];
        //System.out.println(s1[pos]);
        if(pos==max)
{                                                                                                
System.out.println(Arrays.toString(  s1));// + "," + Arrays.toString(  b) + "," + pos + "," + i);
}
else
permute(s1,pos+1, max);


    }}
    
}
