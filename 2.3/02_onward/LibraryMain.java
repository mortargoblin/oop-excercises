public class LibraryMain {
  public static void main(String[] args) {

    Library library = new Library();
    
    Book books[] = {
      new Book("Introduction to Java Programming", "John Smith", 2020),
      new Book("I love the C programming language", "John Smith", 1977),
      new Book("Data Structures and Algorithms", "Jane Doe", 2018),
      new Book("Some book", "Alice Johnson", 1926),
      new Book("Some other book", "John Doe", 1902),
      new Book("Miscelanious book", "John Doe", 2001),
      new Book("Bad book", "John Doe", 2002),
      new Book("Good book", "John Doe", 1965),
    };

    User users[] = {
      new User("Jaakko", 24),
      new User("Jorma", 46),
      new User("Jari", 30),
    };

    for (Book book : books) {
      library.addBook(book);
    }

    for (User user : users) {
      library.addUser(user);
    }

    // Jaakko borrows books

    library.borrowBook("I love the C programming language", "Jaakko");

    library.displayUsers();
  }
}
