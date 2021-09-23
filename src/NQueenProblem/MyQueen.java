package NQueenProblem;

import java.util.Arrays;

public class MyQueen {
    
    public static void main(String[] args) {
        placeQueens(1);
    }
    
  static int n=4;
    static Position[] positions =new Position[n];
    public static boolean IsAttacked(int queenno,int y, int x)
    {
        /*
Queen No is from 1 to 8
        We need to check for attack from previous queens placed
        Array numbering is from 0 to 7
        Queen No 5 will be placed at position 4 and we need to check up 
        to 3
        */
        for(int i=0;i<=queenno-2;i++)
        {
            int px=positions[i].x;
            int py=positions[i].y;
             if(px==x || py==y)
                 return true;
             if(px + py ==x+y)
                 return true;
             if(px-py == x-y)
                 return true;
        }
        return false;
        
    }
    public static void placeQueens(int queenno)
    {
        if(queenno>n)
            return;
        for(int col=1;col<=n;col++)
        {
            int y=queenno;
            int x=col;
            if(IsAttacked(queenno, y, x))
                continue;
            positions[queenno-1]=new Position(x, y);
            if(queenno==n)
                System.out.println(Arrays.toString(positions));
            else
                placeQueens(queenno+1);
            
            
            
        }
    }
    
    
    
    
//**************************************************************
static class Position
{
   int x,y;    

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "{" + "x=" + x + ", y=" + y + '}';
        }
   
}
//**************************************************************

}

