import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  private void printDetails(Book book) {
    System.out.printf(
        "Title: %s, Author: %s, Publication year: %d\n",
        book.getTitle(), book.getAuthor(), book.getPubYear()
        );
  }

  public void displayBooks() {
    for (Book book : books) {
      printDetails(book);
    }
  }

  public void findBooksByAuthor(String author) {
    for (Book book : books) {
      if (author.toLowerCase().equals(book.getAuthor().toLowerCase())) {
        printDetails(book);
      }
    }
  }
}
