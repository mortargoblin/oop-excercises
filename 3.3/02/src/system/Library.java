package system;
import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books = new ArrayList<>();
  private ArrayList<LibraryMember> libraryMembers =
    new ArrayList<>();

  public Book getBookByTitle(String title) {
    for (Book book : books) {
      if (title.equalsIgnoreCase(book.title)) {
        return book;
      }
    }
  }
  public LibraryMember getMemberByUname(String uname) {
    for (LibraryMember member : libraryMembers) {
      if (uname.equalsIgnoreCase(member.name)) {
        return member;
      }
    }
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void removeBook(String title) {
    books.remove(getBookByTitle(title));
  }

  public void lendBook(Book book, String uname) {
    getMemberByUname(uname).addBook(book);
    books.remove(book);
  }

  public void returnBook(Book book, String uname) {
  }
}
