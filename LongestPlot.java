import java.util.*;
public class LongestPlot {
    public static void lp(int house[]) {
        Arrays.sort(house);
        int max = 0, start = 0, end = 0;

        for (int i = 1; i < house.length; i++) {
            int diff = house[i] - house[i - 1];
            if (diff > max) {
                max = diff;
                start = house[i - 1];
                end = house[i];
            }
        }

        System.out.println("Longest plot of land: " + max + " between house " + start + " and house " + end);
    }

    public static void main(String[] args) {
        int house[] = {2, 3, 1, 20};
        lp(house);
    }
}