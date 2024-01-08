package himanshu.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        int a[] = {20, 4, 60, 2, 20};

        System.out.println("Original Array " + Arrays.toString(a));
        int n = a.length;
        for (int i = 0; i <= n - 2; i++) {
            int minpos = i;
            int min = a[minpos];
            for (int j = i + 1; j <= n - 1; j++) {
                if (a[j] > min) {
                    min = a[j];
                    minpos = j;

                }
            }
            int t = a[i];
            a[i] = min;
            a[minpos] = t;

            System.out.println((i + 1) + " " + Arrays.toString(a));
        }
        System.out.println("The sorted array " + Arrays.toString(a));
    }
}
