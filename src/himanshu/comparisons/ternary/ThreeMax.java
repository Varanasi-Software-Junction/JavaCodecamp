package himanshu.comparisons.ternary;

public class ThreeMax {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int max;
//        if (a >= b) {
//            max = a;
//        } else {
//            max = b;
//        }
//        System.out.println(max);
        max = (a >= b) ? a : b;
        System.out.println(max);
        max=(a>=b && a>=c)?a:(b>=c)?b:c;
        System.out.println(max);
        System.out.println((a>=b && a>=c)?a:(b>=c)?b:c);
    }
}
