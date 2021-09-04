package generics;
public class Generic<T>
{ T t;

public Generic(T t)
{ 
    this.t=t;
    
}

public void printClassName()
{ 
System.out.println(t.getClass()); }
public static void main(String[] args)
{ Generic<String > x=new Generic("Hello");
x.printClassName();
Generic<Integer> i=new Generic<>(5);
i.printClassName(); 
} 
}