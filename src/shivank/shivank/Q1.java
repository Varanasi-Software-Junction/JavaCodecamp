package shivank;
import java.util.*;
class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        String s=sc.next();
        int num=Integer.parseInt(s);
        int input=num;
        String list[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String ans="";
        while(num>0)
        {
            int rem=num%10;
            ans=list[rem]+" "+ans;
            num/=10;
        }
        System.out.println("Input: "+input+"\nOutput: "+ans);
    }
    


}
