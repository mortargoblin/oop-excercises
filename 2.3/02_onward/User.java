import java.util.ArrayList;

public class User {
  private String name;
  private int age;
  private ArrayList<Book> borrowedBooks = new ArrayList<>();

  public User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public ArrayList<Book> getBorrowedBooks() {
    return borrowedBooks;
  }

  private Book getBorrowedBookByTitle(String title) {
    for (Book book : borrowedBooks) {
      if (title.equalsIgnoreCase(book.getTitle())) {
        return book;
      }
    }
    return null;
  }

  public void addBorrowedBook(Book book) {
    borrowedBooks.add(book);
  }
  public void removeBorrowedBook(String title) {
    Book book = getBorrowedBookByTitle(title);
    if (book != null) {
      borrowedBooks.remove(book);
    }
  }
}
