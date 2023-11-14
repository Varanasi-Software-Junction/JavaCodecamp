package streamsreaderswriters;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 999);
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());
        Object o = in.readObject();
        System.out.println(o);

    }
}
