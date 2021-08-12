
package primepackages;


public class binary {
    static String pad(String s,int n)
    {
        while(s.length()<n)
            s="0" + s;
        return s;
    }
    public static void main(String[] args) {
        for(int i=0;i<=7;i++)
        {
            int n=i;
        String s="";
        while(n>0)
        {
            int rem=n % 2;
            n=n/2;
            s=rem + s;
        }
        System.out.println(pad(s,3));
    }
}
}