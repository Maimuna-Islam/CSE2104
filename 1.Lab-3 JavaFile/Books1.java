package books1;
import java.util.Scanner;
public class Books1 
{
    private String title;
    private String author;
    private int year;
    public static String genre;
    public static int totalBooks = 0;
    public Books1(String title, String author, int year) 
    {
        this.title = title;
        this.author = author;
        this.year = year;
        totalBooks++;
    }
    public void displayBookDetails() 
    {
        System.out.println("Title:-" + title);
        System.out.println("Author:-" + author);
        System.out.println("Year:-" + year);
        System.out.println("Genre:-" + genre);
        System.out.print("....  ....  ....  ....");
    }
    public static void displayTotalBooks()
    {
        System.out.println("Total number of books: " + totalBooks);
    }
    public static void setGenre(String genre)
    {
        Books1.genre = genre;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter genre for all books:-");
        String genre = sc.nextLine();
        Books1.setGenre(genre);
        Books1[] books = new Books1[3];
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Enter details for book " + (i + 1));
            System.out.print("Title:-");
            String title = sc.nextLine();
            System.out.print("Author:-");
            String author = sc.nextLine();
            System.out.print("Year:-");
            int year = sc.nextInt();
            sc.nextLine(); 
            System.out.println("....  ....  ....  ....");
            books[i] = new Books1(title, author, year);
        }
        for (Books1 book : books)
        {
            book.displayBookDetails();
            System.out.println();
        }
        Books1.displayTotalBooks();
        sc.close();
    }
}