import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number for Fibonacci series: ");
        int maxNumber = scanner.nextInt();

        System.out.println("Fibonacci series up to " + maxNumber + ":");
        printFibonacciSeries(maxNumber);

        scanner.close();
    }

    // Function to print Fibonacci series up to a given maximum number
    private static void printFibonacciSeries(int maxNumber) {
        int first = 0, second = 1;

        while (first <= maxNumber) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}