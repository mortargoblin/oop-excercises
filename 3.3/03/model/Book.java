package model;

public class Book {
  private String title;
  private String author;
  private int isbn;
  private boolean reserved = false;

  public Book(
      String title, 
      String author, 
      int isbn
      ) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
  }

  public void reserve() {
    reserved = true;
  }

  public void unReserve() {
    reserved = false;
  }

  public boolean getReservedStatus() {
    return reserved;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getIsbn() {
    return isbn;
  }
}
