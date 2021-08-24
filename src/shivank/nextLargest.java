package shivank;
import java.util.Scanner;
import java.util.*;




public class nextLargest{
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        boolean check=false;
        char ch[]=s.toCharArray();
        int n=0;
        
        for(int i=ch.length-1;i>0;i--)
        {
            
            if(ch[i]>ch[i-1])
            {
                n=i-2;
                check=true;
                break;
                
                
                //char c=ch[i-1];
                //ch[i-1]=ch[i];
                //ch[i]=c;
                //break;
            }

            

        }
        if(check==false)
        {
            System.out.println("Already Largest");
            return;
        }
        char a=ch[n+1];

        
        int len=ch.length-(n+1);
        
        for(int i=n+1;i<n+1+len-1;i++)
        {
            for(int j=i+1;j<n+1+len;j++)
            {
                if(ch[i]<ch[j])
                {
                    char ne=ch[i];
                    ch[i]=ch[j];
                    ch[j]=ne;

                }
            }



        }
        char d;
        for(int i=len+n+1-1;i>=n+1;i--)
        {
            if(ch[i]>a)
            {
                d=ch[n+1];
                ch[n+1]=ch[i];
                ch[i]=d;
                break;
            }
        }
        for(int i=n+2;i<n+1+len-1;i++)
        {
            for(int j=i+1;j<n+1+len;j++)
            {
                if(ch[i]>ch[j])
                {
                    char ne=ch[i];
                    ch[i]=ch[j];
                    ch[j]=ne;

                }
            }



        }
        for(int i=0;i<=ch.length-1;i++)
        {
            System.out.print(ch[i]);
        }
}
}