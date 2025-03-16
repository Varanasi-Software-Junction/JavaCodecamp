package threadspackage;

 

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
                System.out.println(t + " is busy ");
                wait();
            }
            if (CallCenter.busyphones.contains(this)) {
                System.out.println(this + " is busy ");
                wait();
            }
            CallCenter.busyphones.add(t);
            CallCenter.busyphones.add(this);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%s talking to %s %d\n", phonenumber, t.phonenumber, i);
                Thread.sleep(1000);

            }

            System.out.println(this + " hanging up " + t);

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            CallCenter.busyphones.remove(t);
            CallCenter.busyphones.remove(this);
            notifyAll();
        }
    }
}
