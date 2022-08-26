package patterns.newpatterns;

public class HourGlass {

    public static void main(String[] args) {
        int noofrows = 7;
        for (int row = 1; row <= noofrows; row++) {
            for (int space = 1; space <= noofrows - row; space++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * row - 1; i++) {
                System.out.print("0");
            }
            System.out.println();

        }

        for (int row = noofrows - 1; row >= 1; row--) {
            for (int space = 1; space <= noofrows - row; space++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * row - 1; i++) {
                System.out.print("0");
            }
            System.out.println();

        }

        System.out.println();
        System.out.println();

        for (int row = noofrows; row >= 2; row--) {
            for (int space = 1; space <= noofrows - row; space++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * row - 1; i++) {
                System.out.print("0");
            }
            System.out.println();

        }
        for (int row = 1; row <= noofrows; row++) {
            for (int space = 1; space <= noofrows - row; space++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= 2 * row - 1; i++) {
                System.out.print("0");
            }
            System.out.println();

        }

    }
}
