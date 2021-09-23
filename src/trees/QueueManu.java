package trees;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
public class QueueManu {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList();
         Scanner s=new Scanner(System.in);
         int c;
         while(true)
         {
        System.out.println("0,Exit");
        System.out.println("1,Enter");
        System.out.println("2,view all");
        System.out.println("3, Remove Element ");
        c=s.nextInt();
        if(c==0)
        {
        return;
        }
        if(c==1)
        {
            System.out.println("Enter Number:");
            int n=s.nextInt();
            q.add(n);
             
        }
        if(c==2)
        {
            System.out.println(q);
            
        
        }
       if(c==3)
       {
           System.out.println(q.poll());
       
       }
        
   }
    
    }
}
