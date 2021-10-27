
package sorting;

import java.util.Arrays;
import java.util.Comparator;


public class Person {
    private String name,address;
    private int age;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
    }
    
    public static void main(String[] args) {
        Person[] persons ={new Person("Rahul", "Mumbai", 60),new Person("Sachin", "Mumbai", 50)};
        Arrays.sort(persons, new  AgeSorter());
        System.out.println(Arrays.toString(persons));
         Arrays.sort(persons, new  NameSorter());
        System.out.println(Arrays.toString(persons));
        
    }
}
class AgeSorter implements Comparator<Person>

{

    @Override
    public int compare(Person p1, Person p2) {
       return p1.getAge()-p2.getAge();
    }
    
}
class NameSorter implements Comparator<Person>

{

    @Override
    public int compare(Person p1, Person p2) {
       return p1.getName().compareTo(p2.getName());
    }
    
}