package matrixmultiplication;
import java.util.Scanner;
public class MatrixMultiplication 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows and columns number for matrix A:");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        System.out.println("Enter rows and columns number for matrix B:");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();
        if (colsA != rowsB)
        {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];
        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < rowsA; i++) 
        {
            for (int j = 0; j < colsA; j++)
            {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements for matrix B:");
        for (int i = 0; i < rowsB; i++) 
        {
            for (int j = 0; j < colsB; j++) 
            {
                matrixB[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rowsA; i++) 
        {
            for (int j = 0; j < colsB; j++) 
            {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) 
                {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Multiplication of the matrix:");
        for (int i = 0; i < rowsA; i++) 
        {
            for (int j = 0; j < colsB; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}