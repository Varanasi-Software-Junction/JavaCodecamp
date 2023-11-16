package streamsreaderswriters;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(999);
        while (true) {
            System.out.println("waiting for connection");
            Socket s = ss.accept();

            System.out.println("connected");
            Scanner scanner = new Scanner(s.getInputStream());
            System.out.println("waiting for input");
            String input = scanner.nextLine();
            System.out.println("Client " + input);
            PrintWriter out = new PrintWriter(s.getOutputStream());
            out.println(input);
            out.flush();
            out.close();

        }
    }
}
