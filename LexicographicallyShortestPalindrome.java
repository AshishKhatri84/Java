import java.util.*;
public class LexicographicallyShortestPalindrome {
    public static String findLSP(String str) {
        String minPalindrome = null;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j <= str.length(); j++) { 
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    if (minPalindrome == null || sub.compareTo(minPalindrome) < 0) {
                        minPalindrome = sub;
                    }
                }
            }
        }

        return minPalindrome != null ? minPalindrome : "No palindrome found";
    }

    private static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = findLSP(input);
        System.out.println("Lexicographically shortest palindrome: " + result);
    }}
}