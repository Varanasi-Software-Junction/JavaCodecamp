package chattingsystem;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TwoWayChatServer {

    static class ChatThread implements Runnable {

        private PrintWriter writer;
        private Scanner reader;

        public ChatThread(PrintWriter writer, Scanner reader) {
            this.writer = writer;
            this.reader = reader;
        }

        @Override
        public void run() {

            while (true) {
                //System.out.println("Waiting for one");
                String line = reader.nextLine();
                System.out.println(line);
                writer.println(line);
                writer.flush();

            }
        }

    }

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
        Thread thread1 = new Thread(new ChatThread(pw2, scanner1));
        Thread thread2 = new Thread(new ChatThread(pw1, scanner2));
        thread1.start();
        thread2.start();
    }

}
