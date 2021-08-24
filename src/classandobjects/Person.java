package classandobjects;
class Employee extends Person
{
   int salary;
    Employee(String name,String address, int phone,int age,int salary)
    {
        super(name, address, phone, age);
        
        this.salary=salary;

    }

    
    public String toString()
    {
        return super.toString() +" "+salary+" ";
    }
}
public class Person
{
    
    String name,address;
    int phone,age;

    Person(String name,String address, int phone,int age)
    {
        this.name=name;
        this.address=address;
        this.age=age;
        this.phone=phone;

    }
    public String toString()
    {
        return name+" "+address+" "+age+" "+phone;
    }



    
}
class Manager extends Employee
{
    String dept;
    Employee sec;
    Manager(String dept,String name,int age,String address,int phone,int salary,Employee sec )
    {
        super(name, address, phone, age, salary);
        
        this.dept=dept;
        this.sec=sec;

        


    }
    public String toString()
    {
        return super.toString()+" "+ dept+" ";
    } 
    public static void main(String args[])
    {
        Employee e=new Employee("Sam","Pandeypur",1234561,24,1200);
        Manager a=new Manager("Quality","Shivank",21,"Bhagalpur",234567,10000,e);
        System.out.println(a);
        System.out.println(e);


    }
    


}
