
package abstractandinterface;

public class AbstractUse {
    public static void main(String[] args) {
        Figure f=new Rectangle(4,3);
        
        Rectangle r=new Rectangle(4,3);
        System.out.println(f.credits());
        System.out.println(r.credits());
        Figure[] figures={new Circle(7),new Rectangle(6, 3)};
        for(Figure  figure :figures)
            System.out.println(figure);
        
        
    }
}
