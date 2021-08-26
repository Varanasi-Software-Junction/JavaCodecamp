package classandobjects;
public class oop1
{
    String name,address;
    int age,phone;

    public oop1(String nam,String addres,
    int ag,int phon)
    {
        this.name=nam;
        this.address=addres;
        this.age=ag;
        this.phone=phon;
        

        


    }
    @Override
    public String toString()
    {
        return "Name: "+name+", Age: "+age+", Address: "+address+", Phone: "+phone;



    }
    
    
    public static void main(String args[])
    {
        oop1 ob=new oop1("Shivank","Varanasi",20,1234567890);
        System.out.println(ob);
        //oop1 ob1=new oop1("Rakesh","Gangapur",20,224567890);
        //System.out.println(ob1);
    }
    

}