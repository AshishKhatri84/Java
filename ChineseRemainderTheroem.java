public class ChineseRemainderTheroem {
    public static void main(String[] args) {
        int[] num = {3, 4, 5};
        int[] rem = {2, 3, 1};
        System.out.println(findMinX(num, rem));
    }
    public static int findMinX(int num[], int rem[]) {
        int k = num.length;
        int x = 1;
        while (true) {
            int j;
            for (j = 0; j < k; j++) {
                if (x % num[j] != rem[j]) {
                    break;
                }
            }
            if (j == k) {
                return x;
            }
            x++;
        }
    }
}