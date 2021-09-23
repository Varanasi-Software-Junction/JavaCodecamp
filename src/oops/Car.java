
package oops;
public class Car {
    String company,model,carnumber;//parts
    int carprice;//Class variables
    public void drive()
    {int n=0;//local variable
        System.out.println("Car " + company + model + " is running");
    }

   public  Car(String cmp,String mdl,String carno, int cp)//This is constructor. Constructor has same name as the name of the class
           // and no return
           
   {
       model=mdl;
       company=cmp;
       carprice=cp;
       carnumber=carno;
       
       System.out.println("Constructor");
   }

    @Override
    public String toString() {
        return "Car{" + "company=" + company + ", model=" + model + ", carnumber=" + carnumber + ", carprice=" + carprice + '}';
    }
  
    public static void main(String[] args) {
        Car c1=new Car("Mercedes","Business Model","UP-65 65656",100);//Car constructor called. New allocates memory c1 is the object of type Car
        Car c2=new Car("Maruti","800","UP-65 65659",100);
        c1.drive();
        c2.drive();
        System.out.println(c1);
        System.out.println(c2);
    }
    
}
