package sorting;

import java.util.Arrays;

public class QSort {

    public static void quickSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = a[left];
        int fp = left, temp;
        for (int i = left + 1; i <= right; i++) {
            if (a[i] >= pivot) {
                continue;
            }
            fp++;
            temp = a[i];
            a[i] = a[fp];
            a[fp] = temp;

        }
        a[left] = a[fp];
        a[fp] = pivot;
        quickSort(a, left, fp - 1);
        quickSort(a, fp + 1, right);
    }

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }
}
