
package threadspackage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadsExampleRunnable implements Runnable{
    
    public static void main(String[] args) {
        Thread t1=new Thread(new ThreadsExampleRunnable());
        Thread t2=new Thread(new ThreadsExampleRunnable());
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
