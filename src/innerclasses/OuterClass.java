
package innerclasses;
public class OuterClass {

    @Override
    public String toString() {
        return "OuterClass{" + '}';
    }
    
 public  class InnerClass
   {

        @Override
        public String toString() {
            return "InnerClass{" + '}';
        }
       
   }
   
    public static void main(String[] args) {
        OuterClass oc=new OuterClass();
        OuterClass.InnerClass ic=oc.new  InnerClass();
        System.out.println(oc);
        System.out.println(ic);
        
        OuterClass.InnerClass ic1=new OuterClass().new InnerClass();
        System.out.println(ic1);
        
        
    }
}
