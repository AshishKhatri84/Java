import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

        // Input the array length
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();

        // Create the array and input its elements
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input the target sum
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        // Logic to find the two numbers that add up to the target
        boolean found = false; // Flag to check if solution is found
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // If a pair is found, print their indices
                    System.out.println("Indices: " + i + " and " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("No solution found.");
        }

        sc.close();
    }}
}