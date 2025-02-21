interface Arithmetic {
    public void add(int num1, int num2);
    public void sub(int num1, int num2);
    public void mul(int num1, int num2);
    public void div(int num1, int num2);
    public void mod(int num1, int num2);
}
class Operation implements Arithmetic {
    @Override
    public void add(int num1, int num2) {
        System.out.println("Addition: " + (num1 + num2));
    }
    @Override
    public void sub(int num1, int num2) {
        System.out.println("Subtraction: " + (num1 - num2));
    }
    @Override
    public void mul(int num1, int num2) {
        System.out.println("Multiplication: " + (num1 * num2));
    }
    @Override
    public void div(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Division: " + ((float) num1 / num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
    @Override
    public void mod(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Modulus: " + (num1 % num2));
        } else {
            System.out.println("Cannot calculate modulus with zero.");
        }
    }
}
public class Calculator {
    public static void main(String[] args) {
        Operation calculator = new Operation();
        calculator.add(10, 5);
        calculator.sub(10, 5);
        calculator.mul(10, 5);
        calculator.div(10, 5);
        calculator.mod(10, 3);
    }
}