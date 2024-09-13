class Book 
{
    private String title;
    private String author;
    private int year;
    private String genre;
    public Book(String title, String author, int year, String genre) 
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }
    public void displayDetails() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println();
    }
}
public class BookArray 
{
    public static void main(String[] args) 
    {
        Book[] books = new Book[3];
        books[0] = new Book("Norwegian Wood", "Haruki Murakami", 1987, "Novel");
        books[1] = new Book("Sheser Kobita ", "Robindronath Tagore", 1929, "Novel");
        books[2] = new Book("Bed of Roses", "Nora Roberts", 2009, "Fiction");
        System.out.println("Initial list of books:");
        for (Book book : books) 
        {
            book.displayDetails();
        }
        books[1] = null;
        System.out.println("List of books after removing one:");
        for (Book book : books)
        {
            if (book != null) 
            {
                book.displayDetails();
            }
        }
    }
}