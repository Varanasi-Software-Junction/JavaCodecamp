package practiceSaturdays;

public class hexaToDec {
    public static void main(String[] args) {
        
    
    int h=7762;
    String s="";
    while(h>0)
    {
        int num=h%16;
        h/=16;
        if(num>9)
        {int ch1=(num-10)+65;
            char ch=(char)ch1;
        s=ch+s;}
        else
        s=num+s;
        
    }
    System.out.println(s);
}

}
