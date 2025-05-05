import java.util.*;
public class MajorityinArray {

    // Method 1: HashMap Approach (O(n) time & O(n) space)
    public static int majority(int arr[]) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (int i : map.keySet()) {
            if (map.get(i) > n / 2) {
                return i;
            }
        }
        return -1; // No majority element
    }

    // Moore's Voting Algorithm (O(n) time, O(1) space)
    public static int findMajority(int[] arr) {
        int candidate = 0, count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            } else if (count == 0) {
                candidate = num;
                count = 1;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : arr) if (num == candidate) count++;
        return count > arr.length / 2 ? candidate : -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 5, 2, 2, 6};
        int result = findMajority(arr);
        System.out.println(result != -1 ? "Majority Element: " + result : "No Majority Element");

        // Method 2
        int hashMapResult = majority(arr);
        if (hashMapResult != -1) {
            System.out.println("Majority Element (HashMap): " + hashMapResult);
        } else {
            System.out.println("No Majority Element (HashMap)");
        }
    }
}