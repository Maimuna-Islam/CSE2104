package averagecalculator;
import java.util.Scanner;
public class AverageCalculator 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements number in the array:");
        int n = sc.nextInt();
        double[] numbers = new double[n];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) 
        {
            numbers[i] = sc.nextDouble();
        }
        double sum = 0;
        for (double number : numbers) 
        {
            sum += number;
        }
        double average = sum / n;
        System.out.println("The average is=" + average);
        sc.close();
    }
}