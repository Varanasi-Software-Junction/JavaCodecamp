package stack;
import java.util.LinkedList;
import java.util.Queue;
public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> w=new LinkedList<Integer>();
        w.add(1);
        w.add(2);
        w.add(3);
        w.add(4);
        w.add(5);
        System.out.println(w);
        w.remove();
        System.out.println(w);
        w.remove(3);
        System.out.println(w);
        

            
      
            
        
    }
    
}




