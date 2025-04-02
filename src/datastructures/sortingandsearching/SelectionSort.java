/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructures.sortingandsearching;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {12, 2, 45, 6, -9, 8, 0};
        int n = a.length;
        for (int i = 0; i <= n - 2; i++) {
            int min = a[i];
            int minpos = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minpos = j;
                }
            }
            int t = a[i];
            a[i] = min;
            a[minpos] = t;

        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }
}
