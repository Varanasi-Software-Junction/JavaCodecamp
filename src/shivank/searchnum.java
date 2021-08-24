package shivank;

import java.util.Scanner;

public class searchnum
{
    
    static void khojo(int[] a,int num,int pos)
    {
        if(a[pos]==num)
        System.out.println("True");
        else
        System.out.println("false");


    }

    
    public static void main(String args[])
    {   
       
        Scanner sc=new Scanner(System.in);
         int a[]={1,4,6,9};
        khojo(a,6,2);

    }

}