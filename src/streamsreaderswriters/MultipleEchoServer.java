package streamsreaderswriters;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MultipleEchoServer {

    static class ClientHandler extends Thread {

        PrintWriter out;
        Scanner in;

        public ClientHandler(Socket s) {
            try {
                in = new Scanner(s.getInputStream());
                out = new PrintWriter(s.getOutputStream());
            } catch (Exception ex) {
                System.out.println(ex);

            }
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String line = in.nextLine();
                    out.println(line);
                    out.flush();

                }

            } catch (Exception ex) {
                System.out.println(ex);

            }

        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(999);
        while (true) {
            System.out.println("waiting for connection");
            Socket s = ss.accept();
            MultipleEchoServer.ClientHandler handler = new ClientHandler(s);
            handler.start();
        }
    }
}

