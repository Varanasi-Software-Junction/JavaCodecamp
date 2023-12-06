package himanshu.arithmetic;

import java.util.Scanner;

public class QuadraticEquations {

    public static void main(String[] args) {
        double r1, r2, a, b, c, d, x, y;
        System.out.println("enrer the value of a,b,c");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = (b * b) - (4 * a * c);
        if(d>=0)
        {
            d=Math.sqrt(d);
            double x1=(-b+d)/(2*a);
            double x2=(-b-d)/(2*a);
            System.out.printf("R1=%s, R2=%s\n",x1,x2);
        }
        else
        {
            d=Math.sqrt(-d);
            double realpart=-b/(2*a);
            double imaginarypart=d/(2*a);
            System.out.printf("%s + i*%s\n",realpart,imaginarypart);
            System.out.printf("%s - i*%s\n",realpart,imaginarypart);
        }
    }
}
