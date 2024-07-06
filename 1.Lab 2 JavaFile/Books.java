package books;
import java.util.Scanner;
class Books 
{
    public String title;
    public String author;
    public int year;
    private static String genre;
    private static int totalBooks = 0;
    public Books(String title, String author, int year, String genre) 
    {
        this.title = title;
        this.author = author;
        this.year = year;
        Books.genre = genre;
        totalBooks++;
    }
    public void displayDetails()
    {
        System.out.println("Title:-" + title);
        System.out.println("Author:-" + author);
        System.out.println("Year:" + year);
        System.out.println("Genre:-" + genre);
        System.out.println("...   ...   ...   ...");
    }
    public static void displayTotalBooks()
    {
        System.out.println("Total number of books:-" + totalBooks);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) 
        {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title:-");
            String title = sc.nextLine();
            System.out.print("Author:-");
            String author = sc.nextLine();
            System.out.print("Year:");
            int year = sc.nextInt();
            sc.nextLine();
            System.out.print("Genre:-");
            String genre = sc.nextLine();
            System.out.println("...   ...   ...   ...");
            Books book = new Books(title, author, year, genre);
            book.displayDetails();
            System.out.println();
        }
        Books.displayTotalBooks();
        sc.close();
    }
}
