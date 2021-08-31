
package loops;


public class test {
    public static void main(String[] args) {
        int n=45;
        for(int i=1; i<=n; i++)
        {
            if(n % i==0)
            System.out.println(i);
        }
            int d=2;   
        while(n>1)
        {
            while(n % d==0)
            {
                n=n/d;
                System.out.println(d);
                
            }
            d++;
        }
        
        
    }
}
