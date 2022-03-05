package leetcode;
//code to print product of number in array excluding self
import java.util.Arrays;

public class Q238 {
    public static void main(String[] args) {
        int num[]={5,2,1,-2,3,4,-1};
        int n=num.length;
        int pre[]=new int[n];
        pre[0]=num[0];
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]*num[i];
        }
        pre[n-1]=pre[n-2];
        int suff=num[n-1];
        for(int i=n-2;i>0;i--)
        {
            pre[i]=pre[i-1]*suff;
            suff*=num[i];
        }
        pre[0]=suff;
        System.out.println(Arrays.toString(pre));

    }
    
}
