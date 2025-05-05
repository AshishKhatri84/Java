public class LeadersInArray{
    public static void findLeaders(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Invalid input");
            return;
        }
        int max = arr[arr.length - 1];
        System.out.print("Leaders in Array: " + max);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print("," + max);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,10,22,8,3,1,2};
        findLeaders(arr);
    }
}