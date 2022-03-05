//package BABBAR;
import java.util.Arrays;
//
public class Array6 {
    public static void main(String[] args) {
        int a[]={1,2,3,6,8,7};
        int len=a.length;
        for(int i=0;i<(len/2);i++)
        {
            int temp=a[i];
            a[i]=a[len-1-i];
            a[len-1-i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
    
}