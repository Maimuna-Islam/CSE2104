package movie1;
import java.util.Scanner;
class Movie1 
{
    public String title;
    public String director;
    public int year;
    public static int totalMovies = 0;
    public Movie1(String title, String director, int year) 
    {
        this.title = title;
        this.director = director;
        this.year = year;
        totalMovies++;
    }
    public void displayDetails() 
    {
        System.out.println("Title:" + title);
        System.out.println("Director:" + director);
        System.out.println("Year:" + year);
    }
    public static int getTotalMovies()
    {
        return totalMovies;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("First movie details:");
        System.out.print("Title:");
        String title1 = sc.nextLine();
        System.out.print("Director:");
        String director1 = sc.nextLine();
        System.out.print("Year:");
        int year1 = sc.nextInt();
        sc.nextLine();
        Movie1 movie1 = new Movie1(title1, director1, year1);
        System.out.println("Scecond movie details:");
        System.out.print("Title:");
        String title2 = sc.nextLine();
        System.out.print("Director:");
        String director2 = sc.nextLine();
        System.out.print("Year:");
        int year2 = sc.nextInt();
        Movie1 movie2 = new Movie1(title2, director2, year2);
        System.out.println("\n First movie details:");
        movie1.displayDetails();
        System.out.println("\nSecond movie details:");
        movie2.displayDetails();
        System.out.println("\nTotal number of movies:" + Movie1.getTotalMovies());
        sc.close();
    }
}

