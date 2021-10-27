package stack;

import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        int a1[][]=new int[9][9];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<9;i++)
        {
            System.out.println(Arrays.toString(a1[i]));
        }
        int hints=10;
        System.out.println("Enter Hints: ");
        for(int i=0;i<hints;i++)
        {
            System.out.println("Enter row(1-9): ");
            int r=sc.nextInt();
            r=r-1;
            System.out.println("Enter coulmn(1-9): ");
            int c=sc.nextInt();
            c=c-1;
            System.out.println("Enter Number(1-9): ");
            int num=sc.nextInt();
            a1[r][c]=num;

        }
        for(int i=0;i<9;i++)
        {
            System.out.println(Arrays.toString(a1[i]));
        }

    }
    
}
