package model;
import java.util.ArrayList;

public class LibraryMember {
  public String name;
  public int id;
  private ArrayList<Book> books = 
    new ArrayList<Book>();

  public LibraryMember(
      String name, 
      int id
      ) {
    this.name = name;
    this.id = id;
  }
  
  public void addBook(Book book) {
    books.add(book);
  }

  public void removeBook(Book book) {
    books.remove(book);
  }

  public Book getBookByTitle(String title) {
    for (Book book : books) {
      if (title.equalsIgnoreCase(book.getTitle())) {
        return book;
      }
    }
    return null;
  }

}
