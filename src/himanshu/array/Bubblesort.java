


package himanshu.array;

import java.util.Arrays;
import java.util.Scanner;


public class Bubblesort {
    public static void main(String[] args) {
        int a[]=  {1,2,20,4,5,16};
        System.out.println(" The Array"+ Arrays.toString(a));
        int n = a.length;
        for(int i =0 ; i<=n-2;i++){
            for (int j = 0; j<=n-2;j++){
                if(a[j]>a[j+1]){
                    int temp= a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    
                    
                }
 
            }
        }
         System.out.println(" The Array"+ Arrays.toString(a));
    }
}
