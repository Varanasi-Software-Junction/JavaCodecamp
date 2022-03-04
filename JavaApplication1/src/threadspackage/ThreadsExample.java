
package threadspackage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadsExample extends Thread{
    
    public static void main(String[] args) {
        Thread t1=new ThreadsExample();
        Thread t2=new ThreadsExample();
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
       for(int i=1;i<=5;i++)
       {
           try {
               System.out.println(i);
               Thread.sleep(500);
           } catch (InterruptedException ex) {
               System.out.println(ex);
           }
       }
    }
}
