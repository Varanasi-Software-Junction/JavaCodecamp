package stack;


    import java.util.Arrays;

public class Queens {
    static class XY
    {
        int x,y;

        public XY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "XY{" + "x=" + x + ", y=" + y + '}';
        }

    }
    static  XY[] queens=new  XY[8];
    static int count=0;
    public static void PrintBoard()
    {
        char[][] board=new char[8][8];
        for(int i=0;i<=7;i++)
            board[queens[i].y-1][queens[i].x-1]='Q';
        System.out.println("\nBoard No " + count);
        for(int y=0;y<=7;y++)
        {
            for(int x=0;x<=7;x++)
            {
                if(board[y][x]=='Q')
                    System.out.printf("\tQ");
                else
                if((x + y) % 2==0)

                System.out.printf("\tB");
                else 
                    System.out.printf("\tW");

            }
            System.out.println();
        }
    }
    public static boolean isAttacked(int queenNo,int x,int y)
    {
        for (int i=0;i<=queenNo-2;i++)
        {
            int px=queens[i].x;
            int py=queens[i].y;
            if(px ==x || py==y)
                return true;
            if(px + py==x+y)
                return true;
            if(px-py == x-y)
                return true;

        }
        return false;
    }
    public static void PlaceQueens(int queenno)
    {
        if(queenno>8)
            return;
        for(int col=1;col<=8;col++)
        {
            if(!isAttacked(queenno, queenno, col))
            {
                queens[queenno-1]=new XY(queenno, col);
                if(queenno==8)
                {
                    System.out.println(Arrays.toString(queens));
                    count++;
                    PrintBoard();
                }
                else
                    PlaceQueens(queenno + 1);
            }
        }
    }

    public static void main(String[] args) {
        PlaceQueens(1);
    }
}
    

