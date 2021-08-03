
package ifelse;
import java.util.Scanner;
public class time {
public static void main (String [] agrs){
int hr,min ;
Scanner s=new Scanner(System.in);
System.out.println("enter the time in hours and minutes");
hr=s.nextInt();
min=s.nextInt();
if (hr < 12)
{
 System.out.println(hr + ":" + min + " am");
}
else
    if (hr==12)
{
    System.out.println(hr + ":" + min + " pm");
}
else{
System.out.println((hr-12) + ":" + min + " pm");

}
    
}
    
    

    
   
    
}
