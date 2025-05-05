import java.util.*;
public class TicToe {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(((n-1)/3)+ " ," + ((n-1)%3));
        sc.close();
    }
}
}
