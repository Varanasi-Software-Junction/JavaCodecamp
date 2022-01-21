package waitpackage;

public class WaitDemo extends Thread{
    RunnerClass rc;

    public WaitDemo(RunnerClass rc) {
        this.rc = rc;
    }
    
    public static void main(String[] args) {
        RunnerClass rc=new RunnerClass();
        WaitDemo demo1=new WaitDemo(rc);
        demo1.start();
        
        demo1=new WaitDemo(rc);
        demo1.start();
    }
    
    
    public void run(){
      rc.counter(this);
    }
    public  synchronized void f(WaitDemo wd)
    {
     
    }
}
