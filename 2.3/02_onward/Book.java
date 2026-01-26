import java.util.ArrayList;

public class Book {
  private String title;
  private String author;
  private int publicationYear;
  private double rating;
  private ArrayList<String> reviews = new ArrayList<>();

  public Book(String title, String author, int publicationYear) {
    this.title = title;
    this.author = author;
    this.publicationYear = publicationYear;
  }

  // get
  public String getTitle() {
    return this.title;
  }

  public String getAuthor() {
    return this.author;
  }

  public int getPubYear() {
    return this.publicationYear;
  }

  public double getRating() {
    return this.rating;
  }

  public ArrayList<String> getReviews() {
    return reviews;
  }

  // set
  public void setRating(double rating) {
    this.rating = rating;
  }

  public void addReview(String review) {
    this.reviews.add(review); 
  }
}
