   package primepackages;
import java.util.Arrays;
    import java.util.Scanner;
    public class largestNumber {
     public static void main(String[] args) { 
         int n=57387321;
         String s="" + n;
         String rev="";
         char[] chars=s.toCharArray();
         java.util.Arrays.sort(chars);
         s=new String(chars);//
         for(char ch : chars)
         {
             rev =ch + rev ;
         }
        int maxn=Integer.parseInt(rev);
         System.out.println(n);
         for(int num=n+1;num<=maxn;num++)
         {
             char[] temp=("" + num).toCharArray();
             Arrays.sort(temp);
             String strtemp=new String(temp);
             if(strtemp.equals(s))
             {
                 System.out.println(num);
                 return;
             }
         }
         }
     }
    
  



    
   
   