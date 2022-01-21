
package infosys;

public class IncDesc {
    public static void main(String[] args) {
      int i=1,j=2;
       int x=i++ * ++j + --j - --i*i++ - j++ * j;
              // cr - 28 1 4
              // hr - -2 2 3
               
      
        System.out.println(x + "," + i + "," + j);
    }
}
