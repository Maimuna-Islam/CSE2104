package matrixtranspose1;
import java.util.Scanner;
public class MatrixTranspose1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        int[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
        sc.close();
    }
    public static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix)
        {
            for (int elem : row) 
            {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeMatrix(int[][] matrix) 
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++) 
            {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}