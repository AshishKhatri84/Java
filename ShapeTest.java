class Shape {
    public Shape() {
    }
    public double getPerimeter() {
        return 0.0;
    }
    public double getArea() {
        return 0.0;
    }}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
        return 3 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 3);
    }}
public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
        System.out.println("Circle Area: " + circle.getArea());
    }}