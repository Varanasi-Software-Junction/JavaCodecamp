package Test;
import java.util.Arrays;
public class permutations {
    public static boolean isok(char[]chars)
    {
        int cCount=0;
        int n=chars.length;
        for(int i=0;i<=n-3;i++)
        {
            if((chars[i]=='O' && chars[i+1]=='O' && chars[i+2]=='O'))
                return false;
        }
        
        
        for(char ch : chars)
        {  if(ch=='C')
            cCount++;
        }
        if(cCount>1)
            return false;
        return true;
        
    } 
    public static void main(String[] args) {
        int n=4, co=1;
        char [] options={'C','O','R'};
        char[] a=new char[n];
        for(int i=0;i<3;i++)
        {
        for(int j=0;j<3;j++)
        {
        for (int k=0;k<3;k++)
        {
        for(int m=0;m<3;m++)
        {
        for(int p=0;p<3;p++)    
        {  
       String s= options[i]+""+options[j]+""+options[k]+""+options[m]+""+options[p]+"";
       char a1[]=s.toCharArray();
       if(isok(a1))
                System.out.println(s+" "+ co++);  
        }
        }
        
        
        }
    }
 }
    }
}
    

