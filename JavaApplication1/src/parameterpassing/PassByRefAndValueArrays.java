
package parameterpassing;

import java.util.Arrays;


public class PassByRefAndValueArrays {
    public static void valueSwap(int[] a,int[] b)
    {
        System.out.printf("A=%s,B=%s\n",Arrays.toString( a),Arrays.toString( b));
        int[] t=a;
        a=b;
        b=t;
        System.out.printf("A=%s,B=%s\n",Arrays.toString( a),Arrays.toString( b));
    }
    public static void main(String[] args) {
        int[] x={1},y={3};
        System.out.printf("X=%s,Y=%s\n",Arrays.toString( x),Arrays.toString( y));
        valueSwap(x,y);
        System.out.printf("X=%s,Y=%s\n",Arrays.toString( x),Arrays.toString( y));
    }
 
}
