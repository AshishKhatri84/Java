public class HourGlass {
    public static int findMaxHourGlassSum(int[][] arr) {
        if (arr.length < 3 || arr[0].length < 3) {
            System.out.println("Invalid input");
            return 0;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[0].length - 2; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + 
                          arr[i + 1][j + 1] + 
                          arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20}
        };
        System.out.println("Max Hourglass Sum: " + findMaxHourGlassSum(arr));
    }
}