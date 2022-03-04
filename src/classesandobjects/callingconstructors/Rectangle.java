package classesandobjects.callingconstructors;
public class Rectangle {
    double length, width; 
public double perimeter()
{
    return 2 * (length + width);
}
    public double area()
    {
        return length * width;
    }
    
    public static void main(String[] args) {
        Rectangle r=new Rectangle(6, 5);
        System.out.println(r);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }
    
   public Rectangle(double length, double width) 
   {  
      this.length=length; 
      this.width = width;
      
   } 
     @Override
    public String toString() {
    return "length = " + length + ", width = " + width; 
    }
   

    
}
    

    
    
    

