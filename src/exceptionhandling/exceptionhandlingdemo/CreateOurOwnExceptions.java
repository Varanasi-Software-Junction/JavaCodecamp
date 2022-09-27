package exceptionhandling.exceptionhandlingdemo;
 
import java.util.Scanner;

public class CreateOurOwnExceptions {
 public static int getAge()
 {
     Scanner n=new Scanner (System.in);
     int age=n.nextInt();
     if(age<0)
         throw new InvalidAgeException();
     return age;
 }
public static void main(String[] args) {
    try {
       int age=getAge();
        System.out.println(age);
    } catch (Exception ex) {
        System.out.println(ex);
    }

    }
}

    
    

