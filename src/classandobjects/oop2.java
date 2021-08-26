package classandobjects;
import java.util.*;
public class oop2 {

    String name,address;
    int age,phone;
    public static void main(String args[])
    {
        oop2 ob=new oop2();
        System.out.println(ob);




    }
    public oop2()
    {
        Scanner sc=new Scanner(System.in);
        this.name=sc.nextLine();
        this.age=Integer.parseInt(sc.nextLine());
        this.phone=sc.nextInt();
        this.address=sc.next();

    }
    
    @Override
    public String toString()
    {
        return "Name: "+name+", Age: "+age+", phone: "+phone+", Address: "+address;

    }
    
}
