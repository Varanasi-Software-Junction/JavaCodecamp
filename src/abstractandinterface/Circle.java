package abstractandinterface;
public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius*radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    @Override
    public double perimeter() {
      return 2*Math.PI * radius;
    }
    public double diameter()
    {
        return 2*radius;
    }
}
