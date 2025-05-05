public class EulerTotient {
    // Function to compute GCD using Euclidean Algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Brute-force function to compute Euler's Totient Function φ(n)
    public static int eulerTotient(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (gcd(n, i) == 1) {
                count++;
            }
        }
        return count;
    }

    public static int eulerTotientOptimized(int n) {
        int result = n;

        // Check for all prime factors up to sqrt(n)
        for (int p = 2; p * p <= n; p++) {
            // If p is a factor of n, apply Euler’s formula
            if (n % p == 0) {
                while (n % p == 0) {
                    n /= p;
                }
                result -= result / p; // φ(n) *= (1 - 1/p)
            }
        }

        // If n is still greater than 1, it's prime
        if (n > 1) {
            result -= result / n;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 24;  // Example input
        System.out.println("Euler's Totient function φ(" + n + ") = " + eulerTotient(n));
        System.out.println("Euler's Totient Optimized function φ(" + n + ") = " + eulerTotientOptimized(n));
    }
}