package chattingsystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TwoWayChatClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 999);
        System.out.println("Client Connected");
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(socket.getInputStream());
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        while (true) {
            System.out.println("Enter your message");
            String line = input.nextLine();
            writer.println(line);
            writer.flush();
            line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
