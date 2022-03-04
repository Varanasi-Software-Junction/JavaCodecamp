package trees;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class dijkstraalgorithm {
static int findMin(int[][] a, Set<Integer> s1, int p) {

        // System.out.println(Arrays.toString(a[p]));
        int n = a[0].length;
        int min = 1000;
        int pos = -1;
        for (int i = 0; i <= n - 1; i++) {
            if (a[p][i] == -1)
                continue;
            if (a[p][i] <= min && !s1.contains(i)) {
                min = a[p][i];
                pos = i;
            }
        }
        s1.add(pos);
        return pos;
    }

    static void printBoard(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == -1) {
                    System.out.print("X" + " ");
                    continue;
                }
                if (a[i][j] == Integer.MAX_VALUE)
                    System.out.print("∞" + " ");
                else
                    System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        // System.out.println(max);
        int a[][] = { { -1, 10, 5, max, max }, { max, -1, 2, 1, max }, { max, 3, -1, 9, 2 }, { max, max, max, -1, 4 },
                { 7, max, max, 6, -1 } };
        printBoard(a);
        for (int p = 0; p < a[0].length; p++) {
            Set<Integer> s1 = new HashSet<>();

            int minpos = -1;
            while (true) {
                int i = 0;
                minpos = findMin(a, s1, p);
                // System.out.println(minpos);
                if (minpos == -1)
                    break;

                while (i < a[0].length) {

                    // if(minpos==-1)
                    // break;
                    if (a[p][i] == -1 || i == minpos || a[minpos][i] == Integer.MAX_VALUE) {
                        i += 1;
                        continue;
                    }

                    if (a[minpos][i] + a[p][minpos] < a[p][i] && a[minpos][i] != Integer.MAX_VALUE) {
                        a[p][i] = a[minpos][i] + a[p][minpos];
                        i += 1;
                    } else
                        i += 1;

                    // System.out.println("minpos = " + minpos);
                    // System.out.println(a[0][i]);
                    // System.out.println(Arrays.toString(a[0]));
                }
            }
            System.out.println(Arrays.toString(a[p]));
        }

    }

}
      
      
        
        
        
    
    
    

    
    


