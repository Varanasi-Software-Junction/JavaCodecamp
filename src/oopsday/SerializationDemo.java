package oopsday;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Person person = new Person("Rahul Dravid", "Nagpur", 50);
        FileOutputStream out = new FileOutputStream("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(person);
        oos.flush();
        oos.close();
        FileInputStream in = new FileInputStream("data.txt");
        ObjectInputStream ois = new ObjectInputStream(in);
        person = (Person) ois.readObject();
        ois.close();
        System.out.println(person);

    }
}
