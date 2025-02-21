import java.util.Scanner;
public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rectangle:");

        System.out.print("Enter length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();

        double rectangleArea = calculateRectangleArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);

        System.out.println("\nTriangle:");

        System.out.print("Enter base of the triangle: ");
        double triangleBase = scanner.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double triangleHeight = scanner.nextDouble();

        double triangleArea = calculateTriangleArea(triangleBase, triangleHeight);
        System.out.println("Area of the triangle: " + triangleArea);
        scanner.close();
    }
    private static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    private static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}