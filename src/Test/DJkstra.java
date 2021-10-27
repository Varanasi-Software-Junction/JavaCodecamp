package Test;
   
import java.util.Set;
import java.util.TreeSet;

public class DJkstra {
    static int inf=10000;
    static int min(int a,int b)
    {
        if(a<b)
            return a;
        return b;
    }
    static void print(int [][] mat)
    {
        int n=mat.length;
        System.out.print("\t");
        for(int i=0;i<=n-1;i++)
        {
            char ch=(char)( 'A' + i);
            System.out.print("\t" + ch);
        }
        System.out.println();
        for(int i=0;i<=n-1;i++)
        {
             char ch=(char)( 'A' + i);
            System.out.print("\t" + ch);
          for(int j=0;j<=n-1;j++)
          {
              int value=mat[i][j];
              if(value==-1)
                  System.out.print("\t-");
              else
                  if(value==inf)
                      System.out.print("\tINF");
              else
                System.out.print("\t" + mat[i][j]);
          }
            System.out.println();
  }
    }
    public static void main(String[] args) {
        Set<Integer> s=new TreeSet();
        int mat[][]={{-1,10,inf,5,inf},{inf,-1,1,2,inf},{inf,inf,-1,inf,4},{inf,3,9,-1,2},{7,inf,6,inf,-1}};
        int n=mat.length;
        print(mat);
        
        
        while(true)
        {
        int min=inf;
        int minpos=-1;
        
      for(int i=0;i<n;i++)
      {
      if(s.contains(i))
          continue;
          
          if(mat[0][i]==-1)
        continue;
          if(mat[0][i]<min)
          {
              min=mat[0][i];
              minpos=i;
          }
          
      }
      if(minpos==-1)
          break;
      s.add(minpos);
        System.out.println(min + "," + minpos);
        for(int i=1;i<=n-1;i++)
        {
            if(i==minpos)
                continue;
          mat[0][i]=min(  mat[0][minpos]+ mat[minpos][i],mat[0][i]);
        }
        print(mat);
        System.out.println(s);
 }
        print(mat);
}
}

