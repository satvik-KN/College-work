import java.util.Scanner;

public class L2q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;
        System.out.println("Non-diagonal elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && i + j != n - 1) {
                    System.out.print(matrix[i][j] + " ");
                    sum += matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Sum of non-diagonal elements: " + sum);
    }
}
