package himanshu.comparisons;

public class ThreeMax {

    public static void main(String[] args) {
        int a = 781, b = 22, c = 3;
        int max;
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);

        if (a < b || a < c) {
            if (b >= c) {
                max = b;
            } else {
                max = c;
            }
        } else {
            max = a;
        }
        System.out.println(max);

        if (a >= b) {
            if (a >= c) {
                max = a;
            } else {
                max = c;
            }
        } else if (b >= c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);

        max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }
        System.out.println(max);

    }
}
