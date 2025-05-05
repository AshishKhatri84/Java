public class square {
    public static void main(String[] args) {
        int n = 5; // Example value, you can change it as needed
        boolean[] boolArray = new boolean[n + 1]; // Size n+1 to include 'n'

        // Initialize all elements to true
        for (int i = 2; i <= n; i++) {
            boolArray[i] = true;
        }

        // Mark all multiples of primes as false
        for (int p = 2; p * p <= n; p++) {
            if (boolArray[p]) {
                for (int i = p * p; i <= n; i += p) {
                    boolArray[i] = false;
                }
            }
        }

        // Print the prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (boolArray[i]) {
                System.out.println(i);
            }
        }
    }
}