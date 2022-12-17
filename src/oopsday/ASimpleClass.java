package oopsday;

public class ASimpleClass // Declaration of class starts with the class classname declaration
{
//These are class variables

    String instancedata = "I am instance data";//No special syntax
    static String staticdata = "i am static data";//Starts with the static keyword

    void printData() {
        System.out.println("Static " + staticdata);
        System.out.println("Instance " + instancedata);
    }
//Pogram runs with main

    public static void main(String[] args) {
//        System.out.println(ASimpleClass.staticdata);
        ASimpleClass a1 = new ASimpleClass();//Creating an object
        //new allocates memory, ASimpleClass() is the constructor
        ASimpleClass a2 = new ASimpleClass();
        a1.printData();
        a2.printData();
        ASimpleClass.staticdata = "I changed it";
        a1.instancedata = "Changed instance data";
        a1.printData();
        a2.printData();
    }
    /*
    Static data is shared by all objects of the class.
    Instance is different for each object of the class.
    
    Static is referenced by all objects and stored in the same meomory location.
    Static is accessed by using classname.staticvariablename
    
    Instance is accessed by object.varablename
    
    Static is available from the beginning, instance only after creating an object
    
     */
}
