package streamsreaderswriters;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TwoWayChatServer {

    static class ClientHandler extends Thread {

        PrintWriter out;

        public ClientHandler(Socket s) {
            try {
                out = new PrintWriter(s.getOutputStream());

            } catch (Exception ex) {
                System.out.println(ex);
            }

        }

        @Override
        public void run() {
            try {
                Scanner sc = new Scanner(System.in);
                while (true) {
                    System.out.println("Enter Message");
                    String line = sc.nextLine();
                    out.println(line);
                    out.flush();
                    System.out.println("Sent");

                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(999);

        System.out.println("Waiting for connection");
        Socket s = ss.accept();
        TwoWayChatServer.ClientHandler handler = new TwoWayChatServer.ClientHandler(s);
        handler.start();
        Scanner in = new Scanner(s.getInputStream());

        while (true) {
            System.out.println("Waiting for message");
            String line = in.nextLine();
            System.out.println("Received: " + line);
        }

    }

}
