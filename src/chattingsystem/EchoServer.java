package chattingsystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(999);
        while (true) {
            System.out.println("Server waiting for connection");
            Socket socket = ss.accept();
            System.out.println("Server Connected");
            Scanner scanner = new Scanner(socket.getInputStream());
            System.out.println("Waiting for input");
            String input = scanner.nextLine();
            System.out.println("Input " + input);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println("From Server: "+input);
            writer.flush();
            writer.close();
            scanner.close();

        }
    }
}
