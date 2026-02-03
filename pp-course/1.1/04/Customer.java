import java.util.LinkedList;
import java.util.Scanner;

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
    LinkedList<Customer> queue = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.print("Enter 1 to queue customer, 2 to dequeue customer, 0 to exit\n");
      int input = Integer.parseInt(scanner.nextLine());

      if (input == 1) {
        Customer customer = new Customer();
        customer.setStartTime(System.nanoTime());
        queue.addFirst(customer);
      } else if (input == 2 && queue.size() > 0) {
        Customer customer = queue.getLast();
        customer.setEndTime(System.nanoTime());
        queue.removeLast();
        System.out.printf(
            "customer id: %d, queue time: %d seconds\n", 
            customer.getId(), (long) (customer.getTimeSpent() * Math.pow(10, -9))
            );
      } else if (input == 0) {
        break;
      } else {
        System.out.printf(":DD\n");
      }
    }
    scanner.close();
  }
}

