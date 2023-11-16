package streamsreaderswriters;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TwoWayChatClient {

    static class ClientHandler extends Thread {

        Scanner in;

        public ClientHandler(Socket s) throws IOException {
            in = new Scanner(s.getInputStream());
        }

        public void run() {
            try {
                while(true)
                {
                System.out.println("Waiting for server");
                String txt = in.nextLine();
                System.out.println("server  :" + txt);
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }

    }

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 999);
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        ClientHandler handler = new ClientHandler(s);
        handler.start();
        while (true) {

            System.out.println("enter the message");
            String txt = scanner.nextLine();

            pw.println(txt);
            pw.flush();
            System.out.println("Sent");
        }

    }

}
