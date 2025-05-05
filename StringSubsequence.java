public class StringSubsequence {
    public static boolean isSubsequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        if (n > m) {
            return false;
        }
        int j = 0; 
        for (int i = 0; i < m && j < n; i++) {
            if (str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
        }
        return j == n;
    }
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        System.out.println(isSubsequence(str1, str2)); 
    }
}