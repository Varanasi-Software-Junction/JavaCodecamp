
package sorting;
import java.util.Arrays;
public class Placeorder {
     public static void main(String[] args) {
        int a[]={126,232,451,575};
        int p[]=new int[a.length];
        int q[]=new int[a.length];
        int r[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            p[i]=a[i]%10;// for ones place
            q[i]=(a[i]/10)%10;// for tens place
            r[i]=a[i]/100;//for hundred place 
        }
        Arrays.sort(p);
        Arrays.sort(q);
        Arrays.sort(r);
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(q));
        System.out.println(Arrays.toString(r));
    }
    
}

