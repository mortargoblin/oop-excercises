public class LibraryMain {
  public static void main(String[] args) {

    Library library = new Library();
    
    Book books[] = {
      new Book("Introduction to Java Programming", "John Smith", 2020),
      new Book("I love the C programming language", "John Smith", 1977),
      new Book("Data Structures and Algorithms", "Jane Doe", 2018),
      new Book("The Art of Fiction", "Alice Johnson", 2019)
    };

    for (Book book : books) {
      library.addBook(book);
    }

    System.out.printf("ALL BOOKS\n");
    library.displayBooks();

    System.out.printf("\nBooks by John Smith\n");
    library.findBooksByAuthor("John Smith");
  }
}
