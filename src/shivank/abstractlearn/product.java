package abstractlearn;
public abstract class product{
    
    public abstract String description();
    public abstract int price();
    public abstract int tax(); 
    public static void main(String args[])
    {
        product p=new SimpleProduct("DantKanti",90);
        System.out.println(p.toString());
        product p1=new TaxedProduct("Colgate",98);
        System.out.println(p1.toString());
    }


}
class SimpleProduct extends product
{
    String name;
    int pri;
    
    SimpleProduct(String name,int pri)
    {
        this.name=name;
        this.pri=pri;
       
        
    }
    public String toString()
    {
        return  "Name: "+name+" "+"\n Price: "+pri+" "+"\n Tax: "+tax();
    }
    @Override
    public String description() {
      return  name;


        
    }

    @Override
    public int price() {
        
       return (pri+tax());
    }

    @Override
    public int tax() {
      return 0;
    }
}
class TaxedProduct extends product
{
    String name;
    int pri;
    
    TaxedProduct(String name,int pri)
    {
        this.name=name;
        this.pri=pri;
        
    }
    @Override
    public String description() {
        return name ;
        
    }
    @Override
    public int tax() {
      return 5;
        
    }

    @Override
    public int price() {
        return (pri + tax()); 
        
    }

    
    public String toString()
    {
        return  "Name: "+name+" "+"\n Price: "+price()+" "+"\n Tax: "+tax();
    }
    
}