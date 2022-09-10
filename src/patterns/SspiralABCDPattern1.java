package patterns;

public class SspiralABCDPattern1 {

    public static void main(String[] args) {
        int n = 3;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int count = 1;
        int[][] board = new int[n][n];
        while (count <= n * n) {
            for (int i = left; i <= right; i++) {
                board[top][i] = count;
                count++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                board[i][right] = count;
                count++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                board[bottom][i] = count;
                count++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                board[i][left] = count;
                count++;
            }
            left++;
        }
        //8*****************************************************

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                char ch = (char) ('A' - 1 + board[i][j]);
                System.out.printf("%4s", ch);
            }
            System.out.println();
        }

    }
}
