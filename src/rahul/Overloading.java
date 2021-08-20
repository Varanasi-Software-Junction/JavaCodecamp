package rahul;

public class Overloading {
    public static int add(int ... a)
    {
        int sum=0;
        for(int i=0;i<=a.length-1;i++)
            sum+=a[i];
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4));
    }
}
