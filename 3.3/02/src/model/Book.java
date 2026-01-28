package model;

public class Book {
  public String title;
  public String author;
  public int isbn;

  public Book(
      String title, 
      String author, 
      int isbn
      ) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }
}
