package chattingsystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 999);
        System.out.println("Client Connected");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line");
        String line = scanner.nextLine();
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println(line);
        writer.flush();
        scanner = new Scanner(socket.getInputStream());
        System.out.println("Waiting for input");
        line = scanner.nextLine();
        System.out.println(line);
    }
}
