
package collectionspackage;

import java.util.Arrays;

public class Permutation {
    public static boolean isOk(char[] chars)
    {
        return true;
    }
    public static void main(String[] args) {
        int n=3;
        char[] options={' ','C','O','R'};
        char[] a=new char[n];
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                for(int k=1;k<=n;k++)
                {
                    a[0]=options[ i];
                    a[1]=options[ j];
                    a[2]=options[ k];
                    if(isOk(a))
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }
}
