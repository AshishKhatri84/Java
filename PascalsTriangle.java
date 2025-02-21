import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int numRows = scanner.nextInt();
        displayPascalsTriangle(numRows);
        scanner.close();
    }
    public static void displayPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }
            int value = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1);
            }
            System.out.println();
        }}}