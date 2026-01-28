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

    // could've used user id:s and book id:s for these but idc

    System.out.printf("Jari borrows some book\n");
    library.lendBook("Some book", "Jari");

    System.out.printf("\nALL BOOKS\n");
    library.displayBooks();

    System.out.printf("Joona reserves \"Epic novel\" and \"Cook book\"\n");
    library.reserveBookForMember("Epic novel", "Joona");
    library.reserveBookForMember("Cook book", "Joona");

    System.out.printf("Book reservations by Joona:\n");
    library.displayMemberReservations("Joona");
  }
}
