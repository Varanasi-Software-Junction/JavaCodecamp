package oopsday;

public class Person {//Class declration

    String name, address;//class member variables
    int age;

    public Person(String name, String address, int age) {//Initializes the class member variables
//    Contsructor n java has the same as the name of the class and no return type
        this.name = name;//Transfer to the class  variable. class member variable is also used
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Rahul Dravid", "Bengaluru", 45);// Calling the constructor
        Person p2 = new Person("MS Dhoni", "Ranchi", 40);
        System.out.println(p1);
        System.out.println(p2);
    }
}
