


package threadspackage;


public class CallCenter extends Thread{
Telephone caller,receiver;

    public CallCenter(Telephone caller, Telephone receiver) {
        this.caller = caller;
        this.receiver = receiver;
    }

    @Override
    public void run() {
      caller.call(receiver);
    }
    public static void main(String[] args) {
        Telephone t1=new  Telephone("1");
        Telephone t2=new  Telephone("2");
        Telephone t3=new  Telephone("3");
        Telephone t4=new  Telephone("4");
        CallCenter c1=new CallCenter(t1, t2);
        CallCenter c2=new CallCenter(t1, t3);
       // CallCenter c3=new CallCenter(t3, t4);
        c1.start();
        c2.start();
    }
}
