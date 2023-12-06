package himanshu.arithmetic;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        System.out.println("Enter the radius");
        Scanner s = new Scanner(System.in);

        int r = s.nextInt();
        double area = Math.PI * r * r;
        System.out.println(area);
    }
}
