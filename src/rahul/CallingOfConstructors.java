package rahul;

public class CallingOfConstructors {

    public static void main(String[] args) {
        new A();// Static and Object blocks run and constructor A Run 
        new B();// firstly static and Object blocks and method A runs for A then for B 
        //Static block only run for B and object block & method 'A' run A and B both because static update its value and represent only one time.  
    }
}
/*
Make A and B in CallingOfConstructors
*
*/