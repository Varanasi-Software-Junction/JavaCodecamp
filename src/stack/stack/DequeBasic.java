package stack;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;
public class DequeBasic {
    public static void main(String[] args) {
        //Queue<Integer> w=new Queue<>();
        Deque<Integer> q=new ArrayDeque<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.addFirst(0);
        System.out.println(q);
        q.removeLast();
        System.out.println(q);
        q.removeFirst();
        System.out.println(q);
        System.out.println(q.getFirst());

            
        
            
        
    }
    
}
