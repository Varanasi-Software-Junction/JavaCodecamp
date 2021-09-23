package classesandobjects.callingconstructors;
public class Currency {
int total;  
    public static void main(String[] args) {
    Currency c=new Currency(12, 134);
     System.out.println(c);
        }

    public Currency(int rs ,int paisa)
    {
       this.total=rs*100 + paisa;
       
    }
    
     @Override
    public String toString() {
   int rs=total/100;
   int paisa=total % 100;
    return "₹" + rs + "." + paisa ; 
    
}
}