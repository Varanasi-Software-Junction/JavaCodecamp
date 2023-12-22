


package himanshu.whileloop;


public class Reverseoffibnosis {
    public static void main(String[] args) {
       int  a , b = 21 , c=34;
       System.out.print( c+ " , " +b+ " ");
       a = c-b;
       while ( a>0)
       {
           System.out.print(a+" ,");
           c=b;
           b = a ;
           a = c-b ;
           
       }
      
       System.out.print(a+" ,");
       
       
        
        
    }

}
