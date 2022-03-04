package classesandobjects;
public class Book {
    String bookname,subject;
    Currency price;//Member variables of the class
    
    public static void main(String[] args) {
        Book b1=new Book("Basic C", "C", new Currency(250,78));//Calling the  contsructor
        Book b2=new Book("Basic C++", "C++", new Currency(78, 78));//Calling the  contsructor
        System.out.println(b1);
        System.out.println(b2);
    }
    
    public Book(String bookname,String subject,Currency price)//Constructor
    {
       this.bookname=bookname;
       this.subject=subject;
       this.price=price;
    }
//Person name,age, address
    @Override// To String method gives a string representation of the class
    public String toString() {
        //return "Hello";
    return "Book Name = " + bookname + ", Subject = " + subject + ", Price = " + price; 
    }
}
