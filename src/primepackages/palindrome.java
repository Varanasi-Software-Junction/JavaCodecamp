
package primepackages;
import java.util.Scanner;
public class palindrome {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
    String num = "121";
    String s="" + num;
    System.out.println(s);
    String reverse="";
    char[] chars=s.toCharArray();
    for(char ch:chars)
    {
       // System.out.println(ch);
        reverse=ch + reverse ;
    }
    System.out.println(reverse);
    if(s.equals(reverse))
    System.out.println("Palin");
    else
        System.out.println("Not");
  }
}
