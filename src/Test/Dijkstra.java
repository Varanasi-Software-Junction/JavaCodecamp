package Test;
import java.util.Set;
import java.util.TreeSet;

public class Dijkstra {
static int min(int a,int b)
{
    if(a<b)
    return a;
    else 
    return b;
}
public static void print(int[][] mat)
{
    int n=mat.length;
    for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
         int value=mat[i][j];
         if(value==-1)
        System.out.print("X\t");
         else
      if(value==inf)
        System.out.print("Inf\t");
      else 
       System.out.print(mat[i][j]+"\t");

            }
            System.out.print("\n");
        }
}

static  int inf=10000;

    public static void main(String[] args) {
       Set set=new TreeSet<>();
        int mat[][]={{-1,10,inf,5,inf},{inf,-1,1,2,inf},{inf,inf,-1,inf,4},{inf,3,9,-1,2},{7,inf,6,inf,-1}};
        int min=inf;
        int minpos=-1;
        for (int i=1;i<5; i++) {  
             if(set.contains(i))
             continue;
           if(mat[0][i]<min)  
             
           {
               min= mat[0][i]; 
               minpos=i;
           } 
        }  
        print(mat);
            System.out.println(min + "," + minpos);
            int n=mat.length;  
            for(int i=1;i<=n-1;i++)
            {
                if(i==minpos)
                continue;
                mat[0][i]=min(mat[0][i],mat[0][minpos] + mat[minpos][i]);
            } 
            print(mat);                   
    }        
    
}

