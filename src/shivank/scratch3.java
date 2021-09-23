package shivank;
public class scratch3
{
    public static int func(int num)
    {
         
      
     int s=1;   
    while(num>0)
    {
        s*=num;
        num--;
    }
    return s;


    }
    public static void main(String args[])
    {
        int n=3,sum=0;
        while(n>=0)
        {
            sum+=func(n);
            n--;
        }
        System.out.println(sum);
    }
}