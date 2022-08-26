package patterns.newpatterns;

public class PatternSimpleTriangle {

    public static void main(String[] args) {
        /*
        0
        00
        000
        0000
        
           0 space=3 space + row=4 =n, space=n-0
          00       2
         000       1
        0000       0
        
        
         */
        int noofrows = 4;
        for (int row = 1; row <= noofrows; row++) {
            for (int i = 1; i <= row; i++) {
                System.out.print("0");
            }
            System.out.println();
        }
        
        
        
        
        

        for (int row = 1; row <= noofrows; row++) {
            for (int space = 1; space <= noofrows - row; space++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= row; i++) {
                System.out.print("0");
            }
            System.out.println();
        }
        
        System.out.println();
        for (int row = noofrows; row >=1; row--) {
            for (int i = 1; i <= row; i++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }

}
