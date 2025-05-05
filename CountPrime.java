import java.util.*;
public class CountPrime {
    public static void main(String[] args) {
        int count = 10;
        List<Integer> primes = new ArrayList<>();

        int num = 2;

        while (primes.size() < count) {
            if (isPrime(num)) {
                primes.add(num);
        }
        num++;
    }
            System.out.println(primes);
    }
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