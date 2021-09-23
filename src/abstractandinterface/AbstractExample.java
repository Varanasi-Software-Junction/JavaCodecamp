package abstractandinterface;
public abstract class AbstractExample {
    public abstract void f();
    public static void main(String[] args) {
        AbstractExample example=new ConcreteExample();
        example.f();
    }
    
    
    
}
class ConcreteExample extends AbstractExample
{

    @Override
    public void f() {
        System.out.println("Abstract");
    }
    
}
