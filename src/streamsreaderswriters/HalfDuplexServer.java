


package streamsreaderswriters;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class HalfDuplexServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(999);
                    System.out.println("waiting for connection");
                    
            Socket s=ss.accept();
            Scanner scanner = new Scanner(s.getInputStream());
            Scanner sc=new Scanner(System.in);
            PrintWriter out = new PrintWriter(s.getOutputStream());
        while(true)
        {

            System.out.println("connected");
            
            System.out.println("waiting for input");
            String input=scanner.nextLine();
            System.out.println("replying to the..."+input);
        
            
           String rep=sc.nextLine();
            
            
            out.println(rep);
            out.flush();
           // out.close();
            
            
            
            
            
        }
            
        
    }

}
