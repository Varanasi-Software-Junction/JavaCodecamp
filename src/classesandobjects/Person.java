package classesandobjects;
import java.util.Scanner;
public class Person {
    String personname,add;
    int age;
    
    public static void main(String[] args) {
     Person p1=new Person();
     System.out.println(p1);
     Person p2=new Person("Rahul", "fdsf", 76);
        System.out.println(p2);
    }
     public Person(String name,String add,int age)//Overload
    {
       this.personname=name;
       this.add=add;
       this.age=age;
    }
    public Person()//Overloaded
    
    {
       System.out.println("Enter name,address and age");
       Scanner scanner=new Scanner(System.in);
       this.personname=scanner.nextLine();
       this.add=scanner.nextLine();
       this.age=Integer.parseInt(scanner.nextLine());
       
    }
    @Override
    public String toString() {
   
    return "Person Name = " + personname + ", add = " + add + ", age = " + age; 
    }
}

    

