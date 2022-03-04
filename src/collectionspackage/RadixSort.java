package collectionspackage;

import java.util.Arrays;

public class RadixSort {

    public static int getMaxLength(int[] a)
    {
        int maxlength=-1;
        for(int n:a)
            if(("" + n).length()>maxlength)
                maxlength=("" + n).length();
        return maxlength;
    }
    public static int getDigitAtPosition(int n, int pos) {
        for (int i = 1; i <= pos - 1; i++) {
            n = n / 10;
        }

        return n % 10;
    }

    public static int[] countingSort(int[] a,int keypos) {
        int[] freq = new int[10];
        int n = a.length;
        //System.out.println("Original Array " + Arrays.toString(a));
        for (int i = 0; i <= n - 1; i++) {
            int key=getDigitAtPosition(a[i], keypos);
            freq[key]++;
        }
        //System.out.println("Frequency " + Arrays.toString(freq));
        for (int i = 1; i <= freq.length - 1; i++) {
            freq[i] += freq[i - 1];
        }
        //System.out.println("Cumulative Frequency " + Arrays.toString(freq));

        int[] b = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int value = a[i];
            int key=getDigitAtPosition(value, keypos);
            int pos = freq[key];
            b[pos - 1] = value;
            freq[key]--;

        }
        //System.out.println("Sorted Array " + Arrays.toString(b));
        return b;
    }

    public static void main(String[] args) {
        int[] a = {234, 13, 343, 125, 5000, 15, 96,107};
        System.out.println("Array " + Arrays.toString(a));
        int maxlength=getMaxLength(a);
        System.out.println(maxlength);
        for(int i=1;i<=maxlength;i++)
        {
        a = countingSort(a,i);
        System.out.println("Sorted Array after  " + i + " " + Arrays.toString(a));
        }

    }

}
