package staticandinstance;

public class ExplainingStaticAndInstance {
static 
{
    
}
    static String mystaticvariable = "i have static data";
    String myinstancedata = "I have instance data";

    public void printData() {
        System.out.printf("Static data = %s\n", mystaticvariable);
        System.out.printf("Instance data = %s\n", myinstancedata);
    }

    public static void main(String[] args) {
        ExplainingStaticAndInstance obj1 = new ExplainingStaticAndInstance();
        ExplainingStaticAndInstance obj2 = new ExplainingStaticAndInstance();
        obj1.printData();
        obj2.printData();
        ExplainingStaticAndInstance.mystaticvariable = "Changed static data";
        obj1.myinstancedata = "Changed instance data in obj1";
        obj1.printData();
        obj2.printData();
    }
}
