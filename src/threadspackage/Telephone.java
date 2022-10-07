package threadspackage;

import static jdk.nashorn.internal.objects.NativeFunction.call;

public class Telephone {

    String phonenumber;

    public Telephone(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Telephone{" + "phonenumber=" + phonenumber + '}';
    }

    public synchronized void call(Telephone t) {
        try {
            System.out.println(this + " trying to call " + t);
            if (CallCenter.busyphones.contains(t)) {
                wait();
            }
            if (CallCenter.busyphones.contains(this)) {
                wait();
            }
            CallCenter.busyphones.add(t);
            CallCenter.busyphones.add(this);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%s talking to %s %d\n", phonenumber, t.phonenumber, i);
                Thread.sleep(1000);
                
            }
            CallCenter.busyphones.remove(t);
            CallCenter.busyphones.remove(this);
            System.out.println(this + " hanging up " + t);

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            notifyAll();
        }
    }
}
