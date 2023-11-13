package streamsreaderswriters;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(999);
        while (true) {
            System.out.println("waiting for connection");
            Socket s = ss.accept();

            System.out.println("connected");
            ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
            Person p = new Person("Popat", "Gokuldham", 40);
            out.writeObject(p);
            out.flush();
            out.close();
        }
    }
}
