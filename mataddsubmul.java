import java.util.*;
public class mataddsubmul{
    public static int[][] readMatrix(Scanner sc, int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] + B[i][j];
        return result;
    }
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = A[i][j] - B[i][j];
        return result;
    }
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++)
            for (int j = 0; j < colsB; j++)
                for (int k = 0; k < colsA; k++)
                    result[i][j] += A[i][k] * B[k][j];
        return result;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        System.out.println("\nMatrix A:");
        int[][] A = readMatrix(sc, rows, cols);
        System.out.println("\nMatrix B:");
        int[][] B = readMatrix(sc, rows, cols);
        System.out.println("\nAddition (A + B):");
        int[][] addition = addMatrices(A, B);
        printMatrix(addition);
        System.out.println("\nSubtraction (A - B):");
        int[][] subtraction = subtractMatrices(A, B);
        printMatrix(subtraction);
        System.out.print("\nEnter number of columns for Matrix B (for multiplication): ");
        int colsB = sc.nextInt();
        System.out.println("\nMatrix A (for multiplication):");
        A = readMatrix(sc, rows, cols);
        System.out.println("\nMatrix B (for multiplication):");
        int[][] Bmul = readMatrix(sc, cols, colsB);
        System.out.println("\nMultiplication (A x B):");
        int[][] multiplication = multiplyMatrices(A, Bmul);
        printMatrix(multiplication);
        sc.close();
    }
}