/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infosys;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class Solve {
    public static void main(String[] args) {
        int[] a={5,4,7,6};
        int count=solve(a, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println("No of steps =" + count);
    }
    public static int solve(int[] a,int n)
    {
        int count=0;
        for(int i=0;i<=n-2;i++)
        {
            for(int j=0;j<=n-2-i;j++)
            {
                count++;
                if(a[j]>a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        return count;
    }
}
