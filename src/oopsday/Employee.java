package oopsday;

public class Employee/*sub class derived*/ extends Person /*super class base*/{

    String post;
    int salary;

    public Employee(String name, String address, String post, int age, int salary) {
        super(name, address, age);//calling the super class constructor. First statement in constructor of sub class
        this.post = post;
        this.salary = salary;
    }

    public static void main(String[] args) {
        Person x1 = new Employee("Jack", "London", "Clerk", 40, 2000);
        Employee x2 = new Employee("Jack", "London", "Clerk", 40, 2000);
        Person x3 = new Person("Rahul Dravid", "Bengaluru", 45);
//        Employee x4= new Person("Rahul Dravid", "Bengaluru", 45);

        System.out.println(x1);
    }
/*
    extends, super
    */
    @Override
    public String toString() {
        return super.toString() + ", Employee{" + "post=" + post + ", salary=" + salary + '}';
    }
}
