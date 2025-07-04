package shape;

public class Circle extends Shape {
    private double radius;

    public Circle(){}
    public Circle(int x, int y, double radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI* Math.pow(radius, 2);
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
