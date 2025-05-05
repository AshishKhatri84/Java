public class MaxProductSubArray {
    public static int findMaxProductSubArray(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Invalid input");
            return 0;
        }

        int max = arr[0];
        int min = arr[0];
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * arr[i], min * arr[i]), arr[i]);
            min = Math.min(Math.min(temp * arr[i], min * arr[i]), arr[i]);
            result = Math.max(result, max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-3,2,0,4,-2};
        System.out.println("Max Product SubArray: " + findMaxProductSubArray(arr));
    }
}
