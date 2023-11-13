package streamsreaderswriters;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Person implements Serializable {

    String name, address;
    int age;
    FileOutputStream fileOutputStream;

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", age=" + age + '}';
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Person p1 = new Person("raj", "pandeypur", 17);
        FileOutputStream fos = new FileOutputStream(new File("out.txt"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        // ObjectOutputStream oos = new ObjectOutputStream(System.out);
        oos.writeObject(p1);
        oos.flush();
        oos.close();
    }

}
