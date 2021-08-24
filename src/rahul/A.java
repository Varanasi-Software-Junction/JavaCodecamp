package rahul;
public class A {
    static 
    {
        System.out.println("Static A-1");
    }
     static 
    {
        System.out.println("Static A-2");
    }
     
    {
        System.out.println("Object A-1");
    }
    {
        System.out.println("Object A-2");
    }
        public A()
    {
        System.out.println("Constructor A");
    }
       public static void main(String[] args) {
        //without making object static block only run
        new A(); //1st object create in class A:first run static blocks then object block and at last method A
        new A();//2nd time object create in class A: No Change  
    }
}
