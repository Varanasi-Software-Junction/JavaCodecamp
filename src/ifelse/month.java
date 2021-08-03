package ifelse;
import java.util.Scanner;

public class month {
public static void main(String[] args){
int year;
System.out.println("enter the year ");
Scanner s=new Scanner(System.in);
year=s.nextInt();
 if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
 {
  System.out.println( "feb 28day");
 }
  else{
     System.out.println( "feb 29day");
          }
 
          
          }
}
  
               



