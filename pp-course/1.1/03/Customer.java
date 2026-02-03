public class Customer {
  private static int customerCount = 0;
  private int id;
  private long startTime;
  private long endTime;

  public Customer() {
    customerCount++;
    this.id = customerCount;
  }
  public void setStartTime(long arg) { startTime = arg; }
  public void setEndTime(long arg) { endTime = arg; }

  public long getId() { return id; }
  public long getStartTime() { return startTime; }
  public long getEndTime() { return endTime; }
  public long getTimeSpent() {
    return getEndTime() - getStartTime();
  }

  public static void main(String[] args) {
    Customer customer_1 = new Customer();
    Customer customer_2 = new Customer();

    customer_1.setStartTime(20);
    customer_1.setEndTime(800);
    customer_2.setStartTime(60);
    customer_2.setEndTime(5000);
    System.out.printf(
        "id: %d, time spent: %d\n", 
        customer_1.getId(), customer_1.getTimeSpent()
        );
    System.out.printf(
        "id: %d, time spent: %d\n", 
        customer_2.getId(), customer_2.getTimeSpent()
        );
  }
}
