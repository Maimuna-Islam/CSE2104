package book;
import java.util.*;
public class Book 
{
    private String title;
    private String author;
    private int year;
    private static int totalBooks = 0;
    public Book(String title, String author, int year)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        totalBooks++;
    }
    public void displayDetails() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
    public static void displayTotalBooks() 
    {
        System.out.println("Total number of books: " + totalBooks);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> arrayListBooks = new ArrayList<>();
        LinkedList<Book> linkedListBooks = new LinkedList<>();
        for (int i = 0; i < 2; i++) 
        {
            System.out.println("Enter book details " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("Year: ");
            int year = scanner.nextInt();
            scanner.nextLine();
            Book book = new Book(title, author, year);
            arrayListBooks.add(book);
            linkedListBooks.add(book);
        }
        System.out.println("\nBooks in ArrayList:");
        for (Book book : arrayListBooks) 
        {
            book.displayDetails();
            System.out.println();
        }
        System.out.println("Books in LinkedList:");
        for (Book book : linkedListBooks) 
        {
            book.displayDetails();
            System.out.println();
        }
        Book.displayTotalBooks();
        scanner.close();
    }
}