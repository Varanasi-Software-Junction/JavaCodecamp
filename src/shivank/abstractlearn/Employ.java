package abstractlearn;
// for interface we use implements keyword in place of extends
// one class can implement multiple interfaces
// interface is different from inheritence , in inhertence parent constructor gets called too while in interface it is not so
// interface cannot allocate memory
// interface is not part of inheritence chain
// variables in interface is static,final and public whethher wriiten or not
// in an interface, int x; is invalid, int x=2; is valid because see point 5
// 

class Employ1 implements Ileave{
    String nam;
    int salry;
    String pos;
    Employ1(String nam, int salry,String pos)
    {
        this.nam=nam;
        this.salry=salry;
        this.pos=pos;
    }
    
    public String name() {
        return nam;
        
    }
    
    public String post() {
        return pos;
    }
   
    public int salary() {
       
        return salry;
    }
    
    public String toString() {
        return name()+" "+post()+" "+salary()+ " "+EL();
    }
     
    public static void main(String args[])
    {
        Employ1 a=new Employ1("Vishal", 21000, "Manager");
        System.out.println(a);
    }

    @Override
    public int EL() {
        return 30;
       
    }
    

}
