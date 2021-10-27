package stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueMenu {
    public static void main(String[] args) {
       Queue<Integer> w=new LinkedList<>();
       Scanner sc=new Scanner(System.in);
       int c;
        while(true)
        {
            
            
            System.out.println("0. Exit");
            System.out.println("1. Enter");
            System.out.println("2. View All");
            System.out.println("3. Element on top");
            System.out.println("4. Remove element");
            System.out.println("-----Enter Choice-----");
            c=sc.nextInt();
            if(c==0)
            {
                
                return;
            }
            if(c==1)
            {
                System.out.println("Enter Number: ");
                int s=sc.nextInt();
                w.add(s);

            }
            if(c==2)
            System.out.println(w);
            if(c==3)
            System.out.println("Element on top: "+w.peek());
            if(c==4)
            {   if(w.peek()!=null)
                System.out.println(w.poll()+" is removed from queue");
                else
                System.out.println("Queue is Empty");
            }
            





        }
    }
    
}
