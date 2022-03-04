package shivank;
import java.io.IOException;
import java.util.*;
public class sudokubasic {
    static int sudo[][]=new int[9][9];
    public static void main(String[] args) throws IOException {
        
        //printSudoku(sudo);
        placeItOnBoard(0, 0);
        printSudoku();
        
    }
    
    static void printSudoku()
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
            System.out.print(sudo[i][j]+" ");    
            }
            System.out.println();
        }
    }
    static boolean isRowValid(int row,int arr[][])
    {
        //[0,0,0,0,0,0,0,0,0]
        //[1,2,3,1,0,0,0,0,0]
        //freq =[0,0,0,0,0,0,0,0,0,0]
        //value=1 [0,1,0,0,0,0,0,0,0,0]
        int freq[]=new int[10];
        for(int i=0;i<9;i++)
        {
            int value=arr[row][i];
            if(value==0)
            continue;
            if(freq[value]>0)
            return false;
            freq[value]++;
        }
        return true;
    }
    static boolean isColValid(int col,int arr[][])
    {
        //[0,0,0,0,0,0,0,0,0]
        //[1,2,3,1,0,0,0,0,0]
        //freq =[0,0,0,0,0,0,0,0,0,0]
        //value=1 [0,1,0,0,0,0,0,0,0,0]
        int freq[]=new int[10];
        for(int i=0;i<9;i++)
        {
            int value=arr[i][col];
            if(value==0)
            continue;
            if(freq[value]>0)
            return false;
            freq[value]++;
        }
        return true;
    }
    static boolean isBoxValid(int row,int col,int arr[][])
    {
        int freq[]=new int[10];
        for(int i=row;i<row+3;i++)
        {for(int j=col;j<col+3;j++)
            {
                int value=arr[i][j];
                if(freq[value]>0)
                return false;
                freq[value]++;
                

            }

        }
        return true;

    }
    static boolean ValidCoin()
    {
        for(int i=0;i<9;i++)
        {
        boolean checkR=isRowValid(i,sudo);
        if(!checkR)
        return false;
        boolean checkC=isColValid(i,sudo);
        if(!checkC)
        return false;
        }
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                boolean c=isBoxValid(i, j);
                if(!c)
                return false;
            }
        }
        
        return true;
    }
    static void placeItOnBoard(int i,int j) throws IOException
    {
        for(int p=1;p<=9;p++)
        {
            
            sudo[i][j]=p;
            if(!ValidCoin())
            continue;
            if(i==8 && j==8)
            {
                printSudoku();
                System.in.read();
            }
            else
            {
                if(j<8){placeItOnBoard(i, j+1);}
                else
                placeItOnBoard(i+1, 0);
            }


        }
        sudo[i][j]=0;
    } 
}   
        
        
        

    

    

