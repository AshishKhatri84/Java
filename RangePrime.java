import java.util.*;
public class RangePrime {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  
        
        List<Integer> primes = new ArrayList<>();

        for (int i = 1; i < number; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        System.out.println(primes);
    }}

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
        }}
        return true;
    }}
/*
public class RangePrime {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();  
        
        boolean[] arr= new boolean[number];      

        for (int a = 0; a < number; a++) {
            arr[a]=true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (arr[i] == true) {
                for (int j = i * i; j < number; j += i) {
                    arr[j] = false;
                }
            }
        } System.out.println("The prime numbers are: ");
        for (int i = 2; i < number; i++) {
            if (arr[i] == true) {
                System.out.print(i + " ");
            }
    }   
}}}
*/