import java.util.*;
public class DollarAndCent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the total number of dollar and cent inputs
        System.out.print("Enter the total number of dollar inputs: ");
        int numDollars = scanner.nextInt(); // Number of dollar inputs

        System.out.print("Enter the total number of cent inputs: ");
        int numCents = scanner.nextInt(); // Number of cent inputs

        // Initialize total cents
        int totalCents = 0;

        // Handle dollar inputs
        for (int i = 1; i <= numDollars; i++) {
            System.out.print("Enter dollar " + i + ": ");
            int dollar = scanner.nextInt();
            totalCents += dollar * 100; // Convert to cents and add
        }

        // Handle cent inputs
        for (int i = 1; i <= numCents; i++) {
            System.out.print("Enter cent " + i + ": ");
            int cent = scanner.nextInt();
            totalCents += cent; // Add directly to total cents
            scanner.close();
        }

        // Convert total cents back to dollars and cents
        int totalDollars = totalCents / 100;
        int remainingCents = totalCents % 100;

        // Display the result
        System.out.println("Total amount: " + totalDollars + " dollars and " + remainingCents + " cents");
    }
}