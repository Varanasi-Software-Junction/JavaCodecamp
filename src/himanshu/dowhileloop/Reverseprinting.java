


package himanshu.dowhileloop;
//printing the  number 110,90,72,56,42,30,20,12............

public class Reverseprinting {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        int c = 10 ,t=1 ;
        do{
            int i = (c*c)+c;
            System.out.println(i);
            c--;
            t++;
            
        }
        while (t<9);
        
    }
            

}
