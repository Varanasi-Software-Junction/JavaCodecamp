package Test;
public class question2 {
public static void main(String[] args) {  
         int n=24;
         n=Math.abs(n);
          int i=2;
         while(n>1)
   {
       if(n % i ==  0)
       {
           System.out.println(i );
        while(n% i==0)
     {
      
         n=n/i;
         if(n==1)       
             break;
      }
       }
       else
       i++;
    }
}
}


