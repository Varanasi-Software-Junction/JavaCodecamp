package chattingsystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TwoWayChatServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(999);

        System.out.println("Server waiting for first connection");
        Socket socket1 = ss.accept();
        System.out.println("Server Connected");

        System.out.println("Server waiting for second connection");
        Socket socket2 = ss.accept();
        Scanner scanner1 = new Scanner(socket1.getInputStream());
        Scanner scanner2 = new Scanner(socket2.getInputStream());
        PrintWriter pw1 = new PrintWriter(socket1.getOutputStream());
        PrintWriter pw2 = new PrintWriter(socket2.getOutputStream());
        while (true) {
            System.out.println("Waiting for one");
            String line = scanner1.nextLine();
            pw2.println(line);
            pw2.flush();
            System.out.println("Waiting for two");
            line = scanner2.nextLine();
            pw1.println(line);
            pw1.flush();
        }
    }

}
