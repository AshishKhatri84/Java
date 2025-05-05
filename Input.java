import java.util.*;
public class Input {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){

        System.out.print("Enter your name: ");
        String n = scanner.nextLine();

        System.out.print("Enter your age: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter your gender: ");
        String g = scanner.next();

        System.out.print("Enter your salary: ");
        double s = scanner.nextDouble();

        System.out.println("\nDetails Entered:");
        System.out.println("Name: " + n);
        System.out.println("Age: " + a);
        System.out.println("Gender: " + g);
        System.out.println("Salary: " + s);

        scanner.close();
    }}
}