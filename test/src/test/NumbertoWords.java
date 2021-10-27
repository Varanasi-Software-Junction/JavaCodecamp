
package test;

public class NumbertoWords {
    static String[] digits={"zero","one","two","three","four","five","six","seven","eight","nine"};
    static String[] tens={"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    static String[] teens={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    static String ZeroToNine(int n)
    {
        return digits[n];
    }
    public static String ZeroToNinetyNine(int n)
    {
        if(n<=9)
            return ZeroToNine(n);
        if (n%10==0)
        {
            int t=n/10;
            return tens[t-1];            
        }
        if(n>=11 && n<=19)
        {
            return teens[n-11];
        }
        int ten=n/10-1;
        int digit = n % 10;
        return tens[ten] + " " + digits[digit];
    }
    public static String ZeroTo999(int n)
    {
        if(n<=99)
            return ZeroToNinetyNine(n);
        int hundreddigit=n /100;
        int remainingdigit=n%100;
        if(n%100==0)
            return ZeroToNine(hundreddigit) + " hundred";
        return ZeroToNine(hundreddigit) + " hundred " + ZeroToNinetyNine(remainingdigit);
    }
    public static String ZeroTo99999(int n)
    {
        if(n<=999)
            return ZeroTo999(n);
        int thousanddigit=n/1000;
        int remaining = n % 1000;
        if(n%1000==0)
            return ZeroToNinetyNine(thousanddigit) + " thousand";
        return ZeroToNinetyNine(thousanddigit) + " thousand " + ZeroTo999(remaining);
    }
    public static void main(String[] args) {
        for(int i=0;i<=99999;i++)
        {
            System.out.println(ZeroTo99999(i));
        }
    }
}
