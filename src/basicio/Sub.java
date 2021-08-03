package basicio;
import java.util.Scanner;
public class Sub {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner s=new Scanner(System.in);
        int a =s.nextInt();
        int b=s.nextInt();
        int sub=a-b;
        System.out.println(sub);
        int add=a+b;
        System.out.println(add);
        int multi=a*b;
        System.out.println(multi);
        int divion=a%b;
        System.out.println(divion);
}
}
