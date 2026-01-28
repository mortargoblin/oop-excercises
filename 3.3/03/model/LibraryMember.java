package model;
import java.util.ArrayList;

public class LibraryMember {
  public String name;
  public int id;
  private ArrayList<Book> books = 
    new ArrayList<Book>();
  private ArrayList<Book> reservedBooks = 
    new ArrayList<Book>();

  public LibraryMember(
      String name, 
      int id
      ) {
    this.name = name;
    this.id = id;
  }
  
  public Book getBookByTitle(String title) {
    for (Book book : books) {
      if (title.equalsIgnoreCase(book.getTitle())) {
        return book;
      }
    }
    return null;
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void removeBook(Book book) {
    books.remove(book);
  }

  public void reserve(Book book) {
    if (!book.getReservedStatus()) {
      book.reserve();
      reservedBooks.add(book);
    }
  }

  public void unReserve(Book book) {
    if (!book.getReservedStatus()) {
      book.unReserve();
      reservedBooks.remove(book);
    }
  }

  public ArrayList<Book> getReservedBooks() {
    return reservedBooks;
  }

}
