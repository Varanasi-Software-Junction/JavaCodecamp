/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package waitpackage;

/**
 *
 * @author Lenovo
 */
public class RunnerClass extends Thread{
    public synchronized void  counter(WaitDemo wd)
    {
         try
        {
            wd.notify();
           // this.notifyAll();
            for(int i=1;i<=10;i++)
            {
                System.out.println(i);
                if(i==5)
                    wd.wait();
                Thread.sleep(500);
            }
        }
        catch(Exception ex)
        {
            System.err.println(ex);
        }
    }
}
