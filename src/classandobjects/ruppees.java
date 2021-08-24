package classandobjects;

import java.util.Scanner;

public class ruppees 
{
    int total;
    public ruppees(int rs,int paisa)
    {
        total=rs*100 + paisa;




    }
    public String toString()
    {
        int r=total/100;
        int p=total % 100;
        return "₹"+ r + "." + p;
    }
    public static void main(String args[])
    {
        ruppees ob=new ruppees(12,450);
        System.out.println(ob);

        
    }

}