import java.util.Scanner;
public class SortingAlgorithms 
{
    public static void bubbleSort(int[] array) 
    {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - i - 1; j++) 
            {
                if (array[j] > array[j + 1]) 
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    public static void selectionSort(int[] array) 
    {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
             {
                if (array[j] < array[minIndex]) 
                {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    public static void mergeSort(int[] array) 
    {
        if (array.length < 2) 
        {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, right.length);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }
    private static void merge(int[] array, int[] left, int[] right)
     {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) 
        {
            if (left[i] <= right[j])
            {
                array[k++] = left[i++];
            } 
            else 
            {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) 
        {
            array[k++] = left[i++];
        }
        while (j < right.length) 
        {
            array[k++] = right[j++];
        }
    }
    public static void printArray(int[] array) 
    {
        for (int value : array) 
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            array[i] = scanner.nextInt();
        }
        int[] bubbleArray = array.clone();
        bubbleSort(bubbleArray);
        System.out.println("Sorted array using Bubble Sort:");
        printArray(bubbleArray);
        int[] selectionArray = array.clone();
        selectionSort(selectionArray);
        System.out.println("Sorted array using Selection Sort:");
        printArray(selectionArray);
        int[] mergeArray = array.clone();
        mergeSort(mergeArray);
        System.out.println("Sorted array using Merge Sort:");
        printArray(mergeArray);
        scanner.close();
    }
}