import model.Book;
import model.LibraryMember;
import system.Library;

public class Main {
  public static void main(String[] args) {
    Library library = new Library();

    Book[] books = {
      new Book("Some book", "John Doe", 123),
      new Book("Some other book", "John Doe", 124),
      new Book("Some third book", "John Doe", 125),
      new Book("The C programming language", "Brian Kernighan", 101),
      new Book("Epic novel", "Jane Doe", 256),
      new Book("Cook book", "Aatu Autiosaari", 580)
    };

    for (Book book : books) {
      library.addBook(book);
    }

    LibraryMember[] members = {
      new LibraryMember("Jari", 1),
      new LibraryMember("Joona", 2),
      new LibraryMember("Jaakko", 3)
    };

    for (LibraryMember member : members) {
      library.addMember(member);
    }

    library.lendBook("Some book", "Jari");

    library.displayBooks();

  }
}
