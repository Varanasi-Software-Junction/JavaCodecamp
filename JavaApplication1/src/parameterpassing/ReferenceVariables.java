
package parameterpassing;

import java.util.Arrays;


public class ReferenceVariables {
    public static void valueSwap(int[] a,int[] b)
    {
        System.out.printf("A=%s,B=%s\n",Arrays.toString( a),Arrays.toString( b));
        a[0]=25;
        b[0]=50;
        System.out.printf("A=%s,B=%s\n",Arrays.toString( a),Arrays.toString( b));
    }
    public static void main(String[] args) {
        String s=new String();
        //String *s=new String();
        int[] x={1},y={3};
        System.out.printf("X=%s,Y=%s\n",Arrays.toString( x),Arrays.toString( y));
        valueSwap(x,y);
        System.out.printf("X=%s,Y=%s\n",Arrays.toString( x),Arrays.toString( y));
    }
 
}
