package streamsreaderswriters;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 999);
        System.out.println("enter message");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        PrintWriter pw = new PrintWriter(s.getOutputStream());
        pw.println(line);
        pw.flush();
        //pw.close();
        Scanner in = new Scanner(s.getInputStream());
        line = in.nextLine();
        System.out.println("Server " + line);

    }

}
