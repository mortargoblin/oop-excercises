import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books = new ArrayList<>();
  private ArrayList<User> users = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  public void addUser(User user) {
    users.add(user);
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
      if (author.equalsIgnoreCase(book.getAuthor())) {
        printDetails(book);
      }
    }
  }

  public User getUserByUname(String uname) {
    // bug prone, idc
    User match = users.get(0);
    for (User user : users) {
      if (user.getName().equalsIgnoreCase(uname)) {
        match = user;
      }
    }
    return match;
  }

  public Book getBookByTitle(String title) {
    for (Book book : books) {
      if (title.equalsIgnoreCase(book.getTitle())) {
        return book;
      }
    }
    return null;
  }

  // Task 2
  // modified for task 6
  public void borrowBook(String title, String uname) {
    User user = getUserByUname(uname);
    Book book = getBookByTitle(title);

    user.addBorrowedBook(book);
    if (book != null) {
      books.remove(book);
    }
  }

  public void returnBook(Book book, String uname) {
    User user = getUserByUname(uname);
    books.add(book);
    user.removeBorrowedBook(book.getTitle());
  }

  // Task 3
  public boolean isBookAvailable(String title) {
    for (Book book : books) {
      if (title.equalsIgnoreCase(book.getTitle())) {
        return true;
      }
    }
    return false;
  }
  
  // Task 5
  public double getAverageBookRating() {
    int total = 0;
    
    for (Book book : books) {
      total += book.getRating();
    }
    return total / books.size();
  }

  public Book getMostReviewedBook() {
    Book mostReviewedBook = books.get(0);

    for (Book book : books) {
      if (
          book.getReviews().size() > 
          mostReviewedBook.getReviews().size()
          ) {
        mostReviewedBook = book;
      }
    }
    return mostReviewedBook;
  }

  // Task 6 (??)
  public void displayUsers() {
    for (User user : users) {
      System.out.printf("User: %s\n", user.getName());
      for (Book book : user.getBorrowedBooks()) {
        System.out.printf(
            "Title: %s, Author: %s, Publication year: %d\n",
            book.getTitle(), book.getAuthor(), book.getPubYear()
            );
      }
    }
  }
}

