package shivank;
import java.util.*;
public class password{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter password to check its strength: ");
        String s=sc.nextLine();
        int special=0,small=0,big=0,digit=0;
        int len=s.length();
        if(len<4)
        return;
        int flag=0;
        for(int i=0;i<len;i++)
        {
            
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            digit++;
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            small++;
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
            big++;
            if(s.charAt(i)>='{' && s.charAt(i)<='`' ||s.charAt(i)>=' ' && s.charAt(i)<'0' || s.charAt(i)>'z' && s.charAt(i)<'A' || s.charAt(i)>'9' && s.charAt(i)<'a')
            special++;
            if(special==1 && big==1 && small==1 && digit==1)
            {
                System.out.println("Strong");
                flag=1;
                break;}


        }
        if(flag!=1)
        {System.out.println("Weak");
        return;}
    }
}