package shivank;

public class BaseConversion {
    public static void main(String[] args)
    {
        int n=254,base = 8;
        String result="";
        while(n>0)
        {
int rem = n % base;
n=n/base;
if(rem<10)
result = rem + result;
else
{
    rem=rem-10;
    char ch=(char)('A' + rem);
    result =ch + result;
}
        }
        System.out.println(result);
    }
}
