public class WeightedSubstring {
    // Function to calculate factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Function to calculate weight of a character
    public static long charWeight(char c) {
        int position = c - 'A' + 1;  // 'A' = 1, 'B' = 2, ...
        return factorial(position + 1) / 2;
    }

    // Function to calculate total weight of a string
    public static long weightedSum(String s) {
        long sum = 0;
        for (char c : s.toCharArray()) {
            sum += charWeight(c);
        }
        return sum;
    }

    // Function to find the lexicographically smallest string with weight k
    public static String weightedSubstr(int k){
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26]; // stores weight for A-Z
        int idx = 0;

        // Build weights: A=1, B=3, C=12, D=60, ...
        arr[0] = 1;
        for (int i = 1; i < 26; i++) {
            int w = ((i + 1) * arr[i - 1]) + arr[i - 1];  // (n+1) * prev + prev = (n+2)*prev
            if (w > k) {
                idx = i - 1;
                break;
            }
            arr[i] = w;
        }

        // Greedily subtract largest weights
        for (int i = idx; i >= 0; i--) {
            while (arr[i] <= k) {
                sb.append((char) ('A' + i));  // Append character
                k -= arr[i];                  // Subtract weight
            }
        }

        if (k != 0) return "-1"; // Cannot exactly reach k
        return sb.reverse().toString(); // Reverse for lexicographically smallest result
    }

    public static void main(String[] args) {
        // Example 1: Forward calculation
        String input = "AACCCC";
        long sum = weightedSum(input);
        System.out.println("Weighted sum of \"" + input + "\" is: " + sum);

        // Example 2: Reverse from sum
        int targetWeight = 73;
        String constructed = weightedSubstr(targetWeight);
        System.out.println("String with weight " + targetWeight + " is: " + constructed);

        // Example 3: Try other numbers
        System.out.println("String with weight 50 is: " + weightedSubstr(50));
        System.out.println("Weighted sum of ACD is: " + weightedSum("ACD"));
    }
}