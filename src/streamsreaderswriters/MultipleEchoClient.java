package streamsreaderswriters;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultipleEchoClient {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 999);
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        Scanner in = new Scanner(s.getInputStream());
        while(true)
        {System.out.println("enter the message");
        
        String txt=scanner.nextLine();
        
        pw.println(txt);
        pw.flush();
         
        txt = in.nextLine();
        System.out.println("Server " + txt);
        }
            
            
            
        }

    }

