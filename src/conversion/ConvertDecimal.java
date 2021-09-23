package conversion;
public class ConvertDecimal {
    public static void main(String[] args) {
        int n=254;
        int base=17;
        String output="";
        while(n>0)
        {
            int remainder=n % base;
            n=n/base;
            if(remainder<10)
            output =remainder + output;
            else
            {
                //remainder = 10 0, 11 1, 12 2
                remainder=remainder-10;
                char ch=(char)('A' + remainder);
                output =ch + output;
            }
        }
        System.out.println(output);
    }
}
