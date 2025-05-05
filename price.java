import java.util.*;
public class price {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter month: ");
            int m = sc.nextInt();
            System.out.println("Enter Hotel Tariff: ");
            int ht = sc.nextInt();
            System.out.println("Enter Days: ");
            int d = sc.nextInt();
            switch (m) {
                case 4, 5, 6, 11, 12 -> {
                    ht += (ht * 0.2);
                    System.out.println("The total price of the product is: " + (ht * d));
                }
                case 1, 2, 3, 7, 8, 9, 10 -> System.out.println("The price of the product is: " + (ht * d * 1.1));
                default -> System.out.println("Invalid Month");
            }
        }
    }
}