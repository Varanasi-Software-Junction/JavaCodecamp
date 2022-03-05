package shivank;
import java.util.*;
public class sudoku
{
    public static void main(String[] args) {
        int n=9;
        int a[][]=
        {{3,1,6,5,7,8,4,9,2},
        {0,2,9,1,3,0,7,0,8 },
        {4,8,0,6,2,9,5,3,1 },
        {2,6,3,4,1,5,9,8,7 },
        {0,7,4,8,6 ,0, 1, 2, 5 },
        {8,5,1,7,9 ,0 ,6 ,4 ,3 },
        {1,0,0,9,4 ,7 ,0, 0 ,6 },
        {6,0,2,3,5 ,1 ,8, 7, 4 },
        {7,0,0,0,0 ,0 ,0 ,0 ,0}};
         
        int big[][]=a;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
            if(checkRowCol(i,j,a))
            continue;
            else 
            {
                System.out.println("Not valid at "+i+" "+j);
                break;
            }
            }
        }
        //if(checkSquare(a))
        //System.out.println("True");
        //else
        //System.out.println("false");
        checkSquare(a,big);

        //System.out.println(Arrays.toString(a));


        //possibility(8, 8, a);
    }
    static void printer(int a[][])
    {
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }
    }


    static boolean checkRowCol(int i,int j,int a[][])
    {
        
        for(int p=0;p<9;p++)
        {
            if(a[i][p]==0)
            continue;
        if(a[i][j]==a[i][p] && j!=p)
        return false;}
        for(int q=0;q<9;q++)
        {if(a[q][j]==0)
            continue;
            if(a[i][j]==a[q][j] && i!=q)
        return false;}
        return true;



    }
    static boolean checkSquare(int a[][],int big[][])
    {
        
        int i=3;
        int u=3;
    while(true)
    {
        
        for(int j=u-3;j<u;j++)
        {
            for(int k=i-3;k<i;k++)
            {
                int y[]={1,2,3,4,5,6,7,8,9};
            
                if(a[j][k]==0)
                possibility(j, k, a,big);
            else if(a[j][k]==y[a[j][k]-1] && y[a[j][k]-1]!=0)
            y[a[j][k]-1]=0;
            
            else
            return false;
            
            }
            for(int k=i;k<i+3;k++)
            {
                int y[]={1,2,3,4,5,6,7,8,9};
                if(a[j][k]==0)
                possibility(j, k, a,big);
            else if(a[j][k]==y[a[j][k]-1] && y[a[j][k]-1]!=0)
            y[a[j][k]-1]=0;
            
            else
            return false;
            
            }
            for(int k=i+3;k<i+6;k++)
            {
                int y[]={1,2,3,4,5,6,7,8,9};
                if(a[j][k]==0)
                possibility(j, k, a,big);
            else if(a[j][k]==y[a[j][k]-1] && y[a[j][k]-1]!=0)
            y[a[j][k]-1]=0;
            
            else
            return false;
            
            }
        }
        u+=3;
        if(u==12)
        return true;

    }

    }
    static void possibility(int i,int j,int a[][],int big[][])
    {
        Set<Integer> arr = new HashSet<Integer> (15); 
        
        for(int q=0;q<9;q++)
        {
            if(q==j && a[i][j]==0)
            continue;
            if(arr.contains(a[i][q]))
            continue;
            else
            arr.add(a[i][q]);

        }
        for(int q=0;q<9;q++)
        {
            if(q==i && a[i][j]==0)
            continue;
            if(arr.contains(a[q][j]))
            continue;
            else
            arr.add(a[q][j]);

        }
        int x=i;
        int y=j;
        
        int pos1=((x/3)+1)*3;
        int pos2=((y/3)+1)*3;

        for(int r=pos1-3;r<pos1;r++)
        {
            for(int c=pos2-3;c<pos2;c++)
            {
                arr.add(a[r][c]);
            }
        }
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        b.removeAll(arr);
        int d=0;
        //int elements[]=new int[size];
        if(b.size()>0)
        {
        for(int num:b)
            satisfy(num,i,j,a,big);}
        else
        {
            a[i][j]=0;
            if(j>=8)
            possibility(i+1, 0, a, big);
            else
            possibility(i, j+1, a, big);
            
        }
    }

    static void satisfy(int number,int i,int j,int a[][],int big[][])
    {     
        a[i][j]=number;
        if(j>=8 && i<=7)
        possibility(i+1, 0, a, big);
        else if(j<=7 && i<=8)
        possibility(i, j+1, a, big);

        
        
        
    }
}