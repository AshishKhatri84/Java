public class KaratsubaAlgorithm {
    public static void main(String[] args) {
        long x = 1234;
        long y = 5678;

        long result = karatsuba(x, y);
        System.out.println("Product: " + result);
    }

    public static long karatsuba(long x, long y) {
        if (x < 10 || y < 10) {
            return x * y;
        }

        int numLength = Math.max(Long.toString(x).length(), Long.toString(y).length());
        int halfLength = numLength / 2;

        long highX = x / (long) Math.pow(10, halfLength);
        long lowX = x % (long) Math.pow(10, halfLength);
        long highY = y / (long) Math.pow(10, halfLength);
        long lowY = y % (long) Math.pow(10, halfLength);

        long z0 = karatsuba(lowX, lowY);
        long z1 = karatsuba((lowX + highX), (lowY + highY));
        long z2 = karatsuba(highX, highY);

        return (z2 * (long) Math.pow(10, 2 * halfLength)) +
               ((z1 - z2 - z0) * (long) Math.pow(10, halfLength)) +
               z0;
    }
}