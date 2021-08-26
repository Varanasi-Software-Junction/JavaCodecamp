package ternary;
public class fact
{
    public static int func(int num)
    {
        
    
    return func(num)*func(num-1);


    }
    public static void main(String args[])
    {
        int n=5,s=0;
        while(n>=0)
        {
            s+=fun(n);
            n--;

        }
        
    }
}