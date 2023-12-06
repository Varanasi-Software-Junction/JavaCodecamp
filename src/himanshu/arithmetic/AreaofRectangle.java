


package himanshu.arithmetic;
import java.util.*;



public class AreaofRectangle {
    public static void main(String[] args) {
        int l,b,h;
        System.out.println("enter the value of l ,b,h");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        int volume= l*b*h;
        System.out.println("the volume of rectangle="+volume);
        
    }
}
