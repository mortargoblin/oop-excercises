import java.util.ArrayList;

public class ServicePoint {
  private ArrayList<Customer> queue = new ArrayList<>();

  public void addCustomer(Customer customer) {
    queue.add(customer);
  }

  public ArrayList<Customer> getQueue() {
    return queue;
  }
}
