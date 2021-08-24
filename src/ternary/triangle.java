package ternary;
public class triangle
{
    public static void main(String args[])
    {
        int a=4,b=1,c=4;
        String res=(a==b && a==c && b==c)?"Three sides equal":(a==b || b==c || a==c)?"Two sides euqal":"Zero sides equal";
        System.out.println(res);
    }
}