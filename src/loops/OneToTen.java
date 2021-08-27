
package loops;


public class OneToTen {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++)
            System.out.println(i);
        
        int x=1;
        for(;x<=10;x++)
            System.out.println(x);
         x=1;
        for(;;x++)
        {
            if(x>10)
                break;
            System.out.println(x);
        }
          x=1;
        for(;;)
        {
            if(x>10)
                break;
            System.out.println(x);
            x++;
        }
          //Do nothing infinite loop
        for(;;)
       ;
    }
}

