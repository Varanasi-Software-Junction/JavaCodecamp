package threadspackage;

import static jdk.nashorn.internal.objects.NativeFunction.call;

public class Telephone {

    String phonenumber;
    
    public Telephone(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public synchronized void call(Telephone t) {
        try {
            
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%s calling %s %d\n", phonenumber, t.phonenumber, i);
                Thread.sleep(1000);
            }
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
