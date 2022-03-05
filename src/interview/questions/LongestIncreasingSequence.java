package interview.questions;

public class LongestIncreasingSequence {

    public static void main(String[] args) {
        int[] a = {4, 6, 2, 1, 4, 5, 6, 7, -9};//-9 is an extra addition
        int start = 0;
        int end;
        int n = a.length;
        int maxstart = 0;
        int maxend = 0;
        int maxlength = 0;
        for (int i = 0; i <= n - 2; i++) {
            if (a[i] > a[i + 1]) {
                end = i;
                int length = end + 1 - start;
                if (length > maxlength) {
                    maxstart = start;
                    maxend = end;
                    maxlength = length;
                }
                /*for(int k=start;k<=end;k++)
                 System.out.print(a[k] + ",");
             System.out.println();
                 */
                start = end + 1;

            }
        }
        System.out.println("Max length = " + maxlength);
        for (int k = maxstart; k <= maxend; k++) {
            System.out.print(a[k] + ",");
        }
        System.out.println();

    }
}
