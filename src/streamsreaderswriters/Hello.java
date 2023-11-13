package streamsreaderswriters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Hello {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("out.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
       // Person o=(Person)ois.readObject();
        Serializable o=(Serializable)ois.readObject();
        System.out.println(o);
        
        
    }

}
