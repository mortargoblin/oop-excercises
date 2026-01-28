package system;

import java.util.ArrayList;
import model.Book;
import model.LibraryMember;

public class Library {
  private ArrayList<Book> books = new ArrayList<>();
  private ArrayList<LibraryMember> libraryMembers =
    new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  public void addMember(LibraryMember member) {
    libraryMembers.add(member);
  }

  private Book getBookByTitle(String title) {
    for (Book book : books) {
      if (title.equalsIgnoreCase(book.getTitle())) {
        return book;
      }
    }
    return null;
  }

  private LibraryMember getMemberByUname(String uname) {
    for (LibraryMember member : libraryMembers) {
      if (uname.equalsIgnoreCase(member.name)) {
        return member;
      }
    }
    return null;
  }

  public void displayBooks() {
    for (Book book : books) {
      System.out.printf(
          "Title: %s, Author: %s, ISBN: %d\n",
          book.getTitle(), book.getAuthor(), book.getIsbn()
          );
    }
  }

  public void removeBook(String title) {
    books.remove(getBookByTitle(title));
  }

  public void lendBook(String title, String uname) {
    LibraryMember member = getMemberByUname(uname);
    Book book = getBookByTitle(title);
    if (member != null && book != null) {
      member.addBook(book);
      books.remove(book);
    } // stealthy, silent error :DD
  }

  public void returnBook(String title, String uname) {
    LibraryMember member = getMemberByUname(uname);
    Book book = member.getBookByTitle(title);
    if (member != null && book != null) {
      member.removeBook(book);
      books.add(book);
    } // :D
  }

  public void reserveBookForMember(String title, String uname) {
    Book book = getBookByTitle(title);
    LibraryMember member = getMemberByUname(uname);

    if (member != null && book != null && !book.getReservedStatus()) {
      member.reserve(book);
    } // ::DDD
  }
  public void removeReservationForMember(String title, String uname) {
    Book book = getBookByTitle(title);
    LibraryMember member = getMemberByUname(uname);

    if (member != null && book != null && book.getReservedStatus()) {
      member.unReserve(book);
    } // ::DDD
  }
  public void displayMemberReservations(String uname) {
    LibraryMember member = getMemberByUname(uname);
    if (member != null) {
      for (Book book : member.getReservedBooks()) {
        System.out.printf("Title: %s\n", book.getTitle());
      }
    }
  }

}
