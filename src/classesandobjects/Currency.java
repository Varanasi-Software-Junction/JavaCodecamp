package classesandobjects;
import java.util.Scanner;
public class Currency {
    int total;
    
    public static void main(String[] args) {
         Currency c1=new Currency();
     System.out.println(c1);
        
     }
    public Currency(int rs ,int paisa)
    {
       this.total=rs*100 + paisa;
       
    }
    public Currency ()
    {
        System.out.println("rs, paisa");
        Scanner scanner=new Scanner(System.in);
        int rs=Integer.parseInt(scanner.nextLine());
        int paisa=Integer.parseInt(scanner.nextLine());
        this.total=paisa+100*rs;
        scanner.close();
    }
  @Override
    public String toString() {
   int rs=total/100;
   int paisa=total % 100;
    return "₹" + rs + "." + paisa ; 
}

        
} 
