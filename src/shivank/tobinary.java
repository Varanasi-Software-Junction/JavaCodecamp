package shivank;
import java.util.Scanner;




public class tobinary{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter  Number :");

        String a=sc.next();
        System.out.println("\n Enter Base of Number :");

        int b=sc.nextInt();

        char ch[]=a.toCharArray();
        int c=1,s=0;
        int bas=1;
        int zeroascii='0',nineascii='9';
        for(int i=ch.length-1;i>=0;i--)
        {
            
            if(ch[i]>=48 && ch[i]<=57)
            s=(ch[i]-48)*bas+s;

            else 
            {
                s=(ch[i]-'A'+10)*bas+s;
                
            }
            bas*=b;

            
            
        }
        System.out.println(s);



    } 
}
