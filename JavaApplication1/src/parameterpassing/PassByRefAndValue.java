
package parameterpassing;


public class PassByRefAndValue {
    public static void valueSwap(int a,int b)
    {
        System.out.printf("A=%d,B=%d\n",a,b);
        int t=a;
        a=b;
        b=t;
        System.out.printf("A=%d,B=%d\n",a,b);
    }
    public static void main(String[] args) {
        int x=1,y=3;
        System.out.printf("X=%d,Y=%d\n",x,y);
        valueSwap(x,y);
        System.out.printf("X=%d,Y=%d\n",x,y);
    }
 
}
