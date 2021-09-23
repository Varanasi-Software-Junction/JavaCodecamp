package stackpackage;
import java.util.Deque;
import java.util.ArrayDeque;
public class Dequebasic {
    public static void main(String[] args) {
        
        Deque<Integer> d=new ArrayDeque<Integer>();
        
         d.add(1);
         d.add(2);
         d.add(3);
         d.add(4);
         d.addFirst(0);
         System.out.println(d);
         d.removeLast();
         System.out.println(d);
         d.removeFirst();
         System.out.println(d);
    }
    
}
