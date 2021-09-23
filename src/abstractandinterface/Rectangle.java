
package abstractandinterface;

public class Rectangle extends Figure{
    private int length,breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", breadth=" + breadth + '}';
    }


    @Override
    public double area() {
        return length*breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length + breadth);
    }
    public double diagonal()
    {
        return Math.sqrt(length*length + breadth*breadth);
    }
}
