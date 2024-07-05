package movie;
public class Movie {
    public String title;
    public String genre;
    public String leadActor;
    public String director;
    public int releaseYear;
    public double rating;
    public String review;
    
    public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.review = (rating < 5) ? "Not Good" : "Good";
    }
    
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public String getReview() {
        return review;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadActor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Movie movie1 = new Movie("The Terminal","Comedy-Drama","Tom Hanks","Steven Spielberg",2004,7.4);
        Movie movie2 = new Movie("Children of Heaven","Family Drama","Amir Farrokh Hashemian","MAjid Majidi",1997,8.2);
        Movie movie3 = new Movie("Through the Olive Trees","Drama","Hossein Rezai","Abbas Kiarostam",1994,7.7);
        movie1.displayDetails();
        movie2.displayDetails();
        movie3.displayDetails();
    }
}
