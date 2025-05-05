import java.util.Scanner;
public class MangoTree {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter the row number: ");
        int numRow = scanner.nextInt();
        System.out.print("Enter the column number: ");
        int numCol = scanner.nextInt();
        System.out.print("Enter the total number of trees: ");
        int numTree = scanner.nextInt();

        if(isMangoTree(numRow, numCol, numTree)) {
            System.out.println("It is a mango tree");
        } else {
            System.out.println("It is not a mango tree");
        }scanner.close();
    }}
public static boolean isMangoTree(int row, int column, int totalTrees) {
        return row % 2 == 0 && column % 2 == 0 && totalTrees % 2 == 0;
    }
}