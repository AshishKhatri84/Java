import java.util.Scanner;

public class TrendyNumber{
    // Function to check if a number is trendy
    public static boolean isTrendy(int number) {
        if (number < 100 || number > 999) {  // Ensuring only positive 3-digit numbers are considered
            return false;
        }
        int middleDigit = (number / 10) % 10; // Extract middle digit
        return middleDigit % 3 == 0; // Check divisibility by 3
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a 3-digit number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                number = Math.abs(number);  // Convert negative to positive for checking
            }

            if (number >= 100 && number <= 999) {
                System.out.println(number + " is a 3-digit number.");
                if (isTrendy(number)) {
                    System.out.println(number + " is a trendy number.");
                } else {
                    System.out.println(number + " is not a trendy number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a 3-digit number.");
            }
        }
    }
}