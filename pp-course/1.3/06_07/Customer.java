public class Customer {

  // why is this required????
  private static int customerCount = 0;
  private int id;

  public Customer() {
    customerCount++;
    this.id = customerCount;
  }

  public int getId() {
    return id;
  }
}
