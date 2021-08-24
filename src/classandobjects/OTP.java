package classandobjects;
import java.util.Random;
public class OTP {
    public static void main(String args[])
    {
      
     String otp="";
    for(int i=1;i<=6;i++)
    {
otp=otp + (int)(10 * Math.random());
    }
    System.out.println(otp);
    }
}
